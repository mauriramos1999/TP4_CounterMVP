package com.example.tp4_pil_mobile_basics_countermvp.mvp

class CounterModel : CounterContract.Model{
    private var count = 0

    override fun increment(num: Int){
        count += num
    }

    override fun decrement(num: Int) {
        count -= num
    }

    override fun reset(){
        count = 0
    }

    override fun getCounter(): String{
        return count.toString()
    }
}