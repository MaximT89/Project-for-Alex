package com.max.interview.testbdforalex.data.cache

import com.max.interview.testbdforalex.data.cache.room.UserDao
import com.max.interview.testbdforalex.data.cache.room.UserEntity
import com.max.interview.testbdforalex.domain.listUsers.models.UserDomain

interface UsersCacheDataSource {

    suspend fun fetchUsers() : List<UserDomain>

    suspend fun createUser(userEntity: UserEntity)

    class Base(
        private val userDao: UserDao,
        private val mapperDataToDomain: UsersMapperDataToDomain
    ) : UsersCacheDataSource {
        override suspend fun fetchUsers(): List<UserDomain> {
            val list = userDao.getUsers()
            return list.map { mapperDataToDomain.map(it) }
        }

        override suspend fun createUser(userEntity: UserEntity) {
            userDao.insertUser(userEntity)
        }
    }
}