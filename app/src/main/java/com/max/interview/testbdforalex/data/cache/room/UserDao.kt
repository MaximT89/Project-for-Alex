package com.max.interview.testbdforalex.data.cache.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface UserDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertUser(userEntity: UserEntity)

    @Delete
    suspend fun deleteUser(userEntity: UserEntity)

    @Query("SELECT * FROM 'user_table' WHERE age = :age")
    suspend fun getUsersByAge(age : Int) : List<UserEntity>

    @Query("SELECT * FROM 'user_table' WHERE first_name = :fname")
    suspend fun getUsersByFirstName(fname : String) : List<UserEntity>

    @Query("SELECT * FROM 'user_table' ")
    suspend fun getUsers() : List<UserEntity>
}