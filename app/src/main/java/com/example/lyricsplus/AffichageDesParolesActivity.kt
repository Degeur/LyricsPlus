package com.example.lyricsplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class AffichageDesParolesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_affichage_des_paroles)

        val inputText = intent.getStringExtra("inputText")
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = inputText
    }
}

