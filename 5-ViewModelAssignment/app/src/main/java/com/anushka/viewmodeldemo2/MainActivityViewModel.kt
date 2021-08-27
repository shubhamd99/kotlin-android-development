package com.anushka.viewmodeldemo2

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var total = 0

    fun getTotal(): Int {
        return total
    }

    fun setTotal(input: Int): Int {
        total += input
        return total
    }
}