package com.test.kotlinproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val a:String = "1"
    var b:String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var p = Person()
        p.name
        p.name = "new name"
        p.name
        Log.d("KotlinProject", Car("Tesla", 123456.7, 2019).toString())
        b = "123"

        when(a){
            "1" -> Log.d("KotlinProject","odin")
            "2" -> Log.d("KotlinProject","two")
            "3" -> Log.d("KotlinProject","three")
            "4" -> Log.d("KotlinProject","four")
            "5","6" -> Log.d("KotlinProject","five or six")
        }
        val list = mutableListOf<Int>()
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)
        list.map { Log.d("KotlinProject", it.toString()) }
    }
}
