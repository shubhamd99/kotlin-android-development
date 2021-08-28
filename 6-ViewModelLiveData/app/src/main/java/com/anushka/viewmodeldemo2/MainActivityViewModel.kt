package com.anushka.viewmodeldemo2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel() {
    private var total = MutableLiveData<Int>()
    val totalData : LiveData<Int> // Non Mutable Public Variable

    // Getters
    get() = total

    init {
        total.value = startingTotal
    }

    fun setTotal(input: Int) {
        // Addition total.value += input with null check
        total.value = (total.value) ?.plus(input)
    }
}