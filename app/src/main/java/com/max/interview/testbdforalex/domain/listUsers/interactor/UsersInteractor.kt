package com.max.interview.testbdforalex.domain.listUsers.interactor

import com.max.interview.testbdforalex.domain.listUsers.models.UserDomain
import com.max.interview.testbdforalex.domain.listUsers.repository.ListUsersRepository
import javax.inject.Inject

interface UsersInteractor {

    suspend fun fetchUsers() : List<UserDomain>

    suspend fun createUser(userDomain: UserDomain)

    class UsersInteractorImpl @Inject constructor(private val listUsersRepository: ListUsersRepository) : UsersInteractor{
        override suspend fun fetchUsers(): List<UserDomain> {
            return listUsersRepository.fetchListUsers()
        }

        override suspend fun createUser(userDomain: UserDomain) {
            return listUsersRepository.createUser(userDomain)
        }
    }
}