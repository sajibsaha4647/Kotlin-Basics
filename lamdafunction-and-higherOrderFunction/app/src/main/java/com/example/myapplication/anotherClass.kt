package com.example.myapplication

class anotherClass : Triangle() {

    fun deletion(){
        println("another class is call")
    }

    override fun triangle() {
        println("this is call in trinage fun  class from triange in another calss")
    }

    override fun simpleFunction() {
        println("simple function call")
    }

    override fun inheritcalss() {
        println("inheritcalss function call")
    }

}