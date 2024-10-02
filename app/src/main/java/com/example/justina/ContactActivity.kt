package com.example.justina

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact)

        var arrayAdapter : ArrayAdapter<*>
        var words = arrayOf("Beautiful","Angel face","Caring","Determined","Lovely","Committed",
            "Friendly","Intelligent","Useful","Worth living with","Unrivalled")

        var wordsListView = findViewById<ListView>(R.id.desc_words)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,words)
        wordsListView.adapter = arrayAdapter
    }
}