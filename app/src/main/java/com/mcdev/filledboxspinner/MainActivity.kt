package com.mcdev.filledboxspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

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
        listItems.add("Tidal wave")

        val filledBoxSpinner: FilledBoxSpinner = findViewById(R.id.filled_box_spinner)
        filledBoxSpinner.setItems(listItems)
        filledBoxSpinner.isSearchable(false)
        filledBoxSpinner.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelected(itemValue: String) {
                if (itemValue == "Tidal wave") {
                    filledBoxSpinner.setError("Invalid waveform")
                }
            }

        })

    }
}