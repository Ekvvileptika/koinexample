package com.example.myapplication.koin

import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val modulez = module {
    single { TestClass2() }

    single { TestClass3() }

    factory { KoinClasses(get(), get()) }

    factory { SharedPreferenceModule(androidContext()) }
}

val viewmodels = module{
    viewModel { KoinViewModel(get()) }
    viewModel { KoinSharedViewModel(get()) }
}