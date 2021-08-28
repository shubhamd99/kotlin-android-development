package com.example.a8_twowaydatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val username = MutableLiveData<String>()

    // val usernameData : LiveData<String>
    // get() = username

    init {
        username.value = "Shubham"
    }
}