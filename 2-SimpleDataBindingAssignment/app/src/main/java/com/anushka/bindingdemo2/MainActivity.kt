package com.anushka.bindingdemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.anushka.bindingdemo2.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // control_button -> controlButton
        binding.controlButton.setOnClickListener {
            startOrStopProgressBar()
        }
    }

    private fun startOrStopProgressBar() {
        binding.apply {
            if (progressBar.visibility == View.GONE) {
                progressBar.visibility = View.VISIBLE
                controlButton.text = "Stop"
            } else {
                progressBar.visibility = View.GONE
                controlButton.text = "Start"
            }
        }

    }
}

