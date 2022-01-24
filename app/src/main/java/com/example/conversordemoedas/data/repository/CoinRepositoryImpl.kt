package com.example.conversordemoedas.data.repository

import com.example.conversordemoedas.data.model.ExchangeResponseValue
import com.example.conversordemoedas.data.services.AwesomeService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class CoinRepositoryImpl(
    private val service: AwesomeService
): CoinRepository{

    override suspend fun getExchangeValue(coins: String) = flow {
        val exchangeValue = service.exchangeValue(coins)
        val exchange = exchangeValue.values.first()
        emit(exchange)
    }

}