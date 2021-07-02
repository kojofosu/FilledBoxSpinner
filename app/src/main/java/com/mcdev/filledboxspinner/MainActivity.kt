package com.mcdev.filledboxspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var filledBoxSpinner: FilledBoxSpinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listItems = arrayListOf<Int>()
        listItems.add(2)
        listItems.add(2)
        listItems.add(2)
        listItems.add(2)

        val filledBoxSpinner: FilledBoxSpinner = findViewById(R.id.filled_box_spinner)
        filledBoxSpinner.setItems(listItems)
    }
}