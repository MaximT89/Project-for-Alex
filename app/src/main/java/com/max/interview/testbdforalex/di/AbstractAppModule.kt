package com.max.interview.testbdforalex.di

import com.max.interview.testbdforalex.data.listUsers.repository.ListUsersRepositoryImpl
import com.max.interview.testbdforalex.domain.listUsers.repository.ListUsersRepository
import com.max.interview.testbdforalex.domain.listUsers.interactor.UsersInteractor
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AbstractAppModule {

    @Binds
    abstract fun bindUsersUseCase(usersInteractor: UsersInteractor.UsersInteractorImpl) : UsersInteractor<ListUsersRepository>

    @Binds
    abstract fun bindListUsersRepository(listUsersRepository: ListUsersRepositoryImpl) : ListUsersRepository
}