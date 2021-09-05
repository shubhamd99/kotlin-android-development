package com.example.a12_recyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fruitsList = listOf(
        Fruit("Apple", "Tom"),
        Fruit("Banana", "Team"),
        Fruit("Rasberry", "Woah")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        my_recycyler_view.setBackgroundColor(Color.YELLOW)
        my_recycyler_view.layoutManager = LinearLayoutManager(this)
        my_recycyler_view.adapter = MyRecyclerViewAdapter(fruitsList, {selectedFruitItem: Fruit -> listItemClicked(selectedFruitItem)})
    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(this@MainActivity, "Supplier name is ${fruit.supplier}", Toast.LENGTH_LONG).show()
    }
}