package com.max.interview.testbdforalex.core

interface Mapper<T, R> {

    fun map(data : T) : R
}