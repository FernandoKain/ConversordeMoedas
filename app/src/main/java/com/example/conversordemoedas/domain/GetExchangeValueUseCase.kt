package com.example.conversordemoedas.domain


import com.example.conversordemoedas.core.UseCase
import com.example.conversordemoedas.data.model.ExchangeResponse
import com.example.conversordemoedas.data.model.ExchangeResponseValue
import com.example.conversordemoedas.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
): UseCase<String, ExchangeResponseValue>() {
    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }

}