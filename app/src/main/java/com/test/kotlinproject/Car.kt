package com.test.kotlinproject

data class Car(var model:String,
               var speed:Double,
               var year:Int){
    override fun toString(): String {
        return "$model $speed $year"
    }
}