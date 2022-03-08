package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var emptyArray : ArrayList<Any> = ArrayList()

        val array = arrayOf(1, 442, 3, 4,"sajib",33.33)


       for ((index ,value ) in array.withIndex()){
           if(value is String){
               emptyArray.add(index,value)
           }else{
               emptyArray.add(index,"sorry")
           }

       }

        println(emptyArray.toString()+"empty array")


    }



}


