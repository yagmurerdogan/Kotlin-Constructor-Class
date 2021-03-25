package com.yagmurerdogan.constructorandinitblock

/*
    You can watch the lesson -> https://www.youtube.com/watch?v=d6Lu1Wzspao
    Thanks for "Simplified Coding"! 
 */

fun main() {
    val box1 = Box() //default constructor
    println("Box1 length: ${box1.length}")

    val box2 = Box(50,30,40)
    println("Box2 length: ${box2.length}")

    val box3 = Box(length = 10,
                    width = 10,
                    height = 10
    )
}