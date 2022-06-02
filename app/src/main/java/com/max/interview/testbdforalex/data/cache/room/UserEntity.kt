package com.max.interview.testbdforalex.data.cache.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id : Int,
    @ColumnInfo(name = "first_name") val fName : String,
    @ColumnInfo(name = "list_name") val lName : String,
    val age : Int,
    val icon : Int?,
    val money : Int,
    val job : String?
)
