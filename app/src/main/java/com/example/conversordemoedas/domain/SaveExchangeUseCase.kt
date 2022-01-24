package com.example.conversordemoedas.domain

import com.example.conversordemoedas.core.UseCase
import com.example.conversordemoedas.data.model.ExchangeResponseValue
import com.example.conversordemoedas.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.save(param)
            emit(Unit)
        }
    }
}