package com.example.hw15kt.presenter

import com.example.hw15kt.Injector
import com.example.hw15kt.view.CounterView

class Presenter {

    private val model = Injector.getModel()
    lateinit var view: CounterView


    fun incrementCount() {
        if (model.getCount() == 10) {
            view.showToast()
        }
        if (model.getCount() == 15) {
            view.colorGreen()
        }
        model.increment()
        view.updateCount(model.getCount())
    }



    fun attachView(view: CounterView) {
        this.view = view
    }
}