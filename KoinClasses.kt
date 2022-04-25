package com.example.myapplication.koin

import android.content.Context
import android.content.SharedPreferences

class KoinClasses(val cl: TestClass2, val cl2: TestClass3) {
    fun makeUse(){
        cl.itemMove()
        cl2.makeItem()
    }
}

class TestClass2{
    fun itemMove(): String{
        return "move 3"
    }
}

class TestClass3{
    fun makeItem(): String{
        return "case 3"
    }
}

class SharedPreferenceModule(
    private val context: Context
){
    private val PERSISTANT_STORAGE_NAME = "STORAGENAME"

    fun getSharedPrefences(): SharedPreferences {
        return context.getSharedPreferences(PERSISTANT_STORAGE_NAME, Context.MODE_PRIVATE)
    }

    fun getInt(itemname: String){
        val sharedUnit = getSharedPrefences()
        sharedUnit.getInt(itemname, 0)
    }
}