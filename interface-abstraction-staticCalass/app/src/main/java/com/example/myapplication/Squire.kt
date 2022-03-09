package com.example.myapplication

class Squire : Circle() {

    fun squire(){
        println("squire is called")
    }

    override fun addition() {
        println("addition is called from the class of Cricle")
    }

    override fun substriction() {
        println("substriction is called from the class of Cricle")
    }

}