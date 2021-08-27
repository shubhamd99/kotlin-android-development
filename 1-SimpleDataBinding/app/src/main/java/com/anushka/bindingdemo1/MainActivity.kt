package com.anushka.bindingdemo1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.anushka.bindingdemo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // activity_mail.xml -> ActivityMainBinding
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // @+id/submit_button -> submitButton
        binding.submitButton.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        // @+id/greeting_text_view -> greetingTextView
        binding.apply {
            greetingTextView.text = "Hello! " + nameEditText.text
        }
    }
}
