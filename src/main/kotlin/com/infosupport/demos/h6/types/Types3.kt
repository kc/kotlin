package com.infosupport.demos.h6.types

import com.infosupport.demos.h1.intro.Person

// Nullability: lateinit

// See LateinitTest

class Lateinit {
    fun performAction(): String = "foo"
}

// To lazy init a property, do:

val lazyPerson get() = lazyPersonVal
lateinit var lazyPersonVal: Person

fun init() {
    lazyPersonVal = Person("Bram")
}

fun main() {
    // println(lazyPerson) // will crash
    init()
    println(lazyPerson)
}
