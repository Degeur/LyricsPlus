package com.example.lyricsplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    lateinit var monchamps: EditText
    lateinit var monbouton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        monbouton = findViewById(R.id.buttton)
        monchamps = findViewById(R.id.edit_text)
        monbouton.setOnClickListener {
            val intent = Intent(this, AffichageDesParolesActivity::class.java)
            startActivity(intent)
        }
    }
}
