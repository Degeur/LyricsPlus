package com.example.lyricsplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    EditText monchamps
    newbutton monbouton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mobbouton = findViewById(R.id.buttton)
        monchamps = findViewById(R.id.edit_text)
    }
}