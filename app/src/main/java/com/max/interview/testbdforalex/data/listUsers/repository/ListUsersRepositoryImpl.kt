package com.max.interview.testbdforalex.data.listUsers.repository

import com.max.interview.testbdforalex.data.cache.UsersCacheDataSource
import com.max.interview.testbdforalex.domain.listUsers.models.UserDomain
import com.max.interview.testbdforalex.domain.listUsers.repository.ListUsersRepository

class ListUsersRepositoryImpl(private val usersCacheDataSource: UsersCacheDataSource) : ListUsersRepository {
    override suspend fun fetchListUsers(): List<UserDomain> {
        return usersCacheDataSource.fetchUsers()
    }

    override suspend fun createUser(userDomain: UserDomain) {
        usersCacheDataSource.createUser()
    }
}