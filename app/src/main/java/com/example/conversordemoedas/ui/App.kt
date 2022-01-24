package com.example.conversordemoedas.ui

import android.app.Application
import com.example.conversordemoedas.data.di.DataModules
import com.example.conversordemoedas.domain.di.DomainModule
import com.example.conversordemoedas.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModules.load()
        DomainModule.load()
        PresentationModule.load()
    }
}