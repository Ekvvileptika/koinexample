package com.example.myapplication

import android.app.Application
import com.example.myapplication.datastore.DataStore
import com.example.myapplication.koin.modulez
import com.example.myapplication.koin.viewmodels
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.runBlocking
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.koinApplication

@HiltAndroidApp
class AppMain: Application() {


    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@AppMain)
            modules(listOf(modulez, viewmodels))
        }
    }
}