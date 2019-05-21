package com.test.kotlinproject

import android.util.Log

class Person {
    var name: String = "defaultValue"

        get(){
            Log.d("KotlinProject","getter $field")
            return field
        }

        set(value) {
            Log.d("KotlinProject","setter $field")
            field = value
        }
}