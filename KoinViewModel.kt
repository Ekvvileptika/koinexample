package com.example.myapplication.koin

import androidx.lifecycle.ViewModel

class KoinViewModel(
    val cc: KoinClasses
): ViewModel() {
    init {
        cc.makeUse()
    }
}