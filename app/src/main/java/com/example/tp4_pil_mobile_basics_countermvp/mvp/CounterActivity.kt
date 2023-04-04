package com.example.tp4_pil_mobile_basics_countermvp.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tp4_pil_mobile_basics_countermvp.R

class CounterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        CounterPresenter(CounterModel(), CounterView(this))
    }
}