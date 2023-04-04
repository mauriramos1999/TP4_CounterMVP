package com.example.tp4_pil_mobile_basics_countermvp.mvp

class CounterPresenter(private val model: CounterModel, private val view: CounterView) : CounterContract.Presenter{

    init {
        view.onIncrementButton { onIncrementButton() }
        view.onDecrementButton { onDecrementButton() }
        view.onResetButton { onResetButton() }
    }

    override fun onIncrementButton() {
        val editText_inc = view.getIncrement().toInt()
        if (editText_inc != null) {
            model.increment(editText_inc)
            view.showToast("Increment done!")
            view.setCounter(model.getCounter())
        }
        else
            view.showToast("You need to write something!")
    }

    override fun onDecrementButton() {
        val editText_inc = view.getIncrement().toInt()
        if (editText_inc != null) {
            model.decrement(editText_inc)
            view.showToast("Decrement done!")
            view.setCounter(model.getCounter())
        }
        else
            view.showToast("You need to write something!")
    }

    override fun onResetButton() {
        val editText_inc = view.getIncrement().toInt()
        if (editText_inc != null) {
            model.reset()
            view.showToast("Reset done!")
            view.setCounter(model.getCounter())
        }
        else
            view.showToast("You need to write something!")
    }

}