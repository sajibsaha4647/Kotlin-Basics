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


        Dta(1,2);

        val un: (Int, Int) -> Int? = :: Dta  //lamda function

        val sums = {x:Int,y:Int->x+y}
       var result =  sums(2,4)

        println(result)

    }

    fun Dta(a:Int, b:Int): Int? {
        var res: Int? = null
        if (a != null || b != null) {
            if (a != null) {
                res = (a + b!!)
            };
        };
        return  res;
    };

    fun newsum(sajib:(t:Int,p:Int)->Int){

    }




}


