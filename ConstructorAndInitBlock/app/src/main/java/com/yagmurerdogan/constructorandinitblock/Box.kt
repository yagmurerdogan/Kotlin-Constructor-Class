package com.yagmurerdogan.constructorandinitblock

class Box constructor( // we can delete "constructor" word, nothing will change
    // these "0,0,0" are default values, so when we use Box() we don't have to give parameters
    // primary constructor;
    var length: Int = 0,
    var width: Int = 0,
    var height: Int = 0
) {

    // if you want to write any logic in constructor, you can write it in init blocks

    init { // init means -> just after that primary constructor
        println("Init Block Called")
    }

    // we can create secondary constructor, but it is not recommended
    // these 0 are default values but we can describe defaults in primary constructor as well
    // don't use var or val in secondary constructor
    // "this" for call primary constructor

    constructor() : this(0,0,0) {
        println("Secondary Constructor Called")
    }

    val volume
        get() = length * width * height

    fun fillContents() {
        println("Box is Filled")
    }

    fun open() {
        println("Box Opened")
    }
}