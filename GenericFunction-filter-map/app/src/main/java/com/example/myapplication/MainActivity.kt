package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    var another : anotherClass = anotherClass() //all interface class

    var Squire : Squire = Squire() //this is all abstract class

    val instance = CamponionObject; //this as like static class

    var nums = arrayListOf<Any>("0","3","45","6","76")

    var adds = arrayListOf<Any>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         for((ind,value ) in nums.withIndex()){
             adds.add(ind,value)
         }
        sums(nums)

//        ===============array add list===========

      var res =   nums.filter { a->a.equals("0") }


       if(res.equals("")){
//           println(res+"here is the filter result")
       }else{
//           println(res+"false is the filter result")
       }
    //        ===============array add filter===========

        var mapResult = nums.map {
            println(it)
        }

        println(mapResult)

    //        ===============array map filter===========

        //============use of generic function=============


        var iContainer = container<Int>(3);
       var result =  iContainer.getvalue()

        println(result)



    }

    fun sums(nums: ArrayList<Any>) {
//        println(nums)
    }
}

class  container<T>(var i:T){


    fun setvalue(value:T){
        i = value
    }

    fun getvalue() : T{
        return i;
    }

}



