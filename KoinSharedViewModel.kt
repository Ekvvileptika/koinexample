package com.example.myapplication.koin

import androidx.lifecycle.ViewModel

class KoinSharedViewModel(
    val sharedModule: SharedPreferenceModule
): ViewModel() {
    init {
        sharedModule.getInt("indexMe")
    }
}