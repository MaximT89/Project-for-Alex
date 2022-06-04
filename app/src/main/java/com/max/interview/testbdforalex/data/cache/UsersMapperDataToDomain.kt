package com.max.interview.testbdforalex.data.cache

import com.max.interview.testbdforalex.core.Mapper
import com.max.interview.testbdforalex.data.cache.room.UserEntity
import com.max.interview.testbdforalex.domain.listUsers.models.UserDomain

class UsersMapperDataToDomain : Mapper<UserEntity, UserDomain> {
    override fun map(data: UserEntity): UserDomain {
        return UserDomain(data.id, data.fName, data.lName, data.age, data.icon, data.money, data.job)
    }
}