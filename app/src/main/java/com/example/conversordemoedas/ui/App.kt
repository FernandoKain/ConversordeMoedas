package com.example.conversordemoedas.ui

import android.app.Application
import com.example.conversordemoedas.data.di.DataModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@App)
        }
        DataModules.load()
    }
}