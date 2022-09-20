package com.example.hw15kt

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hw15kt.databinding.ActivityMainBinding
import com.example.hw15kt.presenter.Presenter
import com.example.hw15kt.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {

    lateinit var binding: ActivityMainBinding
    private var presenter = Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        binding.incrementBtn.setOnClickListener {
            presenter.incrementCount()
        }


    }

    override fun updateCount(count: Int) {
        binding.counterTv.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this , "Поздравляю!" , Toast.LENGTH_SHORT).show()
    }

    override fun colorGreen() {
        binding.counterTv.setBackgroundColor(Color.GREEN)
    }
}