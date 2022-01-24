package com.example.conversordemoedas.domain.di


import com.example.conversordemoedas.domain.GetExchangeValueUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module
import com.example.conversordemoedas.domain.ListExchangeUseCase
import com.example.conversordemoedas.domain.SaveExchangeUseCase

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModules())
    }

    private fun useCaseModules(): Module {
        return module {
            factory { ListExchangeUseCase(get()) }
            factory { SaveExchangeUseCase(get()) }
            factory { GetExchangeValueUseCase(get()) }
        }
    }
}