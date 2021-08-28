package com.anushka.viewmodeldemo2

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel() {
    private var total = 0

    init {
        total = startingTotal
    }

    fun getTotal(): Int {
        return total
    }

    fun setTotal(input: Int): Int {
        total += input
        return total
    }
}