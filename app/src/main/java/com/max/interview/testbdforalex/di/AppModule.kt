package com.max.interview.testbdforalex.di

import android.content.Context
import androidx.room.Room
import com.max.interview.testbdforalex.data.cache.room.AppDatabase
import com.max.interview.testbdforalex.data.cache.room.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase =
        Room.databaseBuilder(context,
            AppDatabase::class.java,
            "app_database")
            .build()

    @Provides
    @Singleton
    fun provideUserDao(appDatabase: AppDatabase): UserDao = appDatabase.userDao()
}