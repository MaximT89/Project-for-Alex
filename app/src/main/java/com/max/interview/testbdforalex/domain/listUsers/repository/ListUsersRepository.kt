package com.max.interview.testbdforalex.domain.listUsers.repository

import com.max.interview.testbdforalex.domain.listUsers.models.UserDomain

interface ListUsersRepository {

    suspend fun fetchListUsers() : List<UserDomain>

    suspend fun createUser(userDomain: UserDomain)
}