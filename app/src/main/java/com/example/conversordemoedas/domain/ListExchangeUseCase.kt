package com.example.conversordemoedas.domain


import com.example.conversordemoedas.core.UseCase
import com.example.conversordemoedas.data.model.ExchangeResponseValue
import com.example.conversordemoedas.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}