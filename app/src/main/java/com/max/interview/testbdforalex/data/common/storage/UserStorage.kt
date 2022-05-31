package com.max.interview.testbdforalex.data.common.storage

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
}