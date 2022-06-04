package com.max.interview.testbdforalex.domain.listUsers.models

data class UserDomain(
    val id : Int,
    val fName : String,
    val lName : String,
    val age : Int,
    val icon : Int?,
    val money : Int,
    val job : String?
)