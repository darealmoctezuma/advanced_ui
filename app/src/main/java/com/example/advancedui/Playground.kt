package com.example.advancedui

class Playground {

    fun main() {
        printNumber { 1 + 1 }
        printNumber(this::getNumberFive)
    }

    fun getNumberFive() = 3 + 2


    fun printNumber(numberFunction: () -> Int) {
        println(numberFunction.invoke().toString())
    }


}