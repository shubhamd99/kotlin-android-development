package com.anushka.viewmodeldemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.anushka.viewmodeldemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModelFactory = MainActivityViewModelFactory(125) // Starting Total
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)

        binding.resultTextView.text = viewModel.getTotal().toString()

        binding.insertButton.setOnClickListener {
            getValueFromInputAndAdd()
        }
    }

    fun getValueFromInputAndAdd() {
        binding.apply {
            val value = inputEditText.text
            if (!value.isEmpty()) {
                viewModel.setTotal(value.toString().toInt())
                binding.resultTextView.text = viewModel.getTotal().toString()
            }
        }
    }
}