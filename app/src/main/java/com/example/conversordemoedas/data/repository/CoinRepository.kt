package com.example.conversordemoedas.data.repository

import com.example.conversordemoedas.data.model.ExchangeResponseValue
import kotlinx.coroutines.flow.Flow


interface CoinRepository {

    suspend fun getExchangeValue(coins: String): Flow<ExchangeResponseValue>
}