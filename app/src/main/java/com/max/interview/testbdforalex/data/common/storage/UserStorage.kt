package com.max.interview.testbdforalex.data.common.storage

import com.max.interview.testbdforalex.data.cache.room.Icons
import javax.inject.Inject


class UserStorage @Inject constructor(){

    fun getRandomFirstName() = listOf(
        "Nick",
        "Ann",
        "Max",
        "Tony",
        "Peter"
    ).random()

    fun getRandomLastName() = listOf(
        "Tompson",
        "Petrov",
        "Ivanov",
        "Zacharov",
        "Sidorov"
    ).random()

    fun getRandomAge() = (10..80).random()

    fun getMoney() = (0..60000).random()

    fun getJob() = listOf(
        "Hr",
        "Android developer",
        "Worker",
        "Fisher",
        "C++ developer",
        "Designer",
        "Product manager",
        "Director"
    ).random()

    fun getIcon() : Int = listOf(
        Icons.USER1.id,
        Icons.USER2.id,
        Icons.USER3.id,
        Icons.USER4.id,
        Icons.USER5.id,
        Icons.USER6.id,
        Icons.USER7.id,
        Icons.USER8.id,
        Icons.USER9.id,
        Icons.USER10.id,
        Icons.USER11.id,
        Icons.USER12.id,
        Icons.USER13.id
    ).random()
}