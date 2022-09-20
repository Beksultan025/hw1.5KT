package com.example.hw15kt

import com.example.hw15kt.model.CounterModel
import com.example.hw15kt.presenter.Presenter
import com.example.hw15kt.view.CounterView

class Injector {

    companion object {
        fun getPresenter(): Presenter{
            return Presenter()
        }
        fun getModel():CounterModel {
            return CounterModel()
        }
    }
}