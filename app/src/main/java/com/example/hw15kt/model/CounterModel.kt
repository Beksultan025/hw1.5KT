package com.example.hw15kt.model

class CounterModel {

    private var count = 0

    fun increment() {
        count++

    }

    fun getCount(): Int {
        return count
    }

}