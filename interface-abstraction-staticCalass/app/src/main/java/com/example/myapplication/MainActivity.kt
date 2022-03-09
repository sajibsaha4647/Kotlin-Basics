package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    var another : anotherClass = anotherClass() //all interface class

    var Squire : Squire = Squire() //this is all abstract class

    val instance = CamponionObject; //this as like static class


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Squire.squire()
        Squire.addition()
        Squire.substriction()

        instance.campinion()

        another.deletion();
        another.inheritcalss()
        another.simpleFunction()
        another.triangle()


    }




}


