package com.example.conversordemoedas.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.conversordemoedas.R
import com.example.conversordemoedas.ui.main.data.model.Coin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindingAdapters()

    }

    private fun bindingAdapters() {
        val list = Coin.values()
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
    }
}