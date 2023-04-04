package com.example.tp4_pil_mobile_basics_countermvp.mvp

interface CounterContract {

    interface Presenter{
        fun onIncrementButton()
        fun onDecrementButton()
        fun onResetButton()
    }

    interface View{
        fun onIncrementButton(onClick: () -> Unit)
        fun onDecrementButton(onClick: () -> Unit)
        fun onResetButton(onClick: () -> Unit)
        fun getIncrement(): String
        fun showToast(message: String)
        fun setCounter(num: String)
    }

    interface Model{
        fun increment(num: Int)
        fun decrement(num: Int)
        fun reset()
        fun getCounter(): String
    }
}