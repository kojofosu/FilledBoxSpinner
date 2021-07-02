package com.mcdev.filledboxspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var filledBoxSpinner: FilledBoxSpinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listItems = arrayListOf<String>()
        listItems.add("Sine wave")
        listItems.add("Square wave")
        listItems.add("Triangle wave")
        listItems.add("Sawtooth wave")

        filledBoxSpinner = findViewById(R.id.filled_box_spinner)
        filledBoxSpinner.setItems(listItems)
    }
}