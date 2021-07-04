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
        listItems.add("Lil")
        listItems.add("weezy")
        listItems.add("wayne")
        listItems.add("tunechi")

        val filledBoxSpinner: FilledBoxSpinner = findViewById(R.id.filled_box_spinner)
        filledBoxSpinner.setItems(listItems)
        filledBoxSpinner.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelected(itemValue: String) {
                Toast.makeText(this@MainActivity, itemValue, Toast.LENGTH_LONG).show()
            }

        })

    }
}