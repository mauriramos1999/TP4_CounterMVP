package com.example.tp4_pil_mobile_basics_countermvp.mvp

import android.app.Activity
import android.widget.Toast
import com.example.tp4_pil_mobile_basics_countermvp.databinding.ActivityCounterBinding

class CounterView(activity: Activity) : CounterContract.View, ActivityView(activity){

    private var binding : ActivityCounterBinding = ActivityCounterBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }
    override fun onIncrementButton(onClick: () -> Unit){
        binding.buttonToIncrease.setOnClickListener { onClick() }
    }

    override fun onDecrementButton(onClick: () -> Unit){
        binding.buttonToDecrease.setOnClickListener { onClick() }
    }

    override fun onResetButton(onClick: () -> Unit){
        binding.buttonReset.setOnClickListener { onClick() }
    }

    override fun getIncrement() : String{
        return binding.editIncrement.text.toString()
    }

    override fun setCounter(num: String){
        binding.txtCounter.text = num
    }

    override fun showToast(message: String){
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()

    }
}