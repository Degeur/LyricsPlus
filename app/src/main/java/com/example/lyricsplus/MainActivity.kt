package com.example.lyricsplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import com.example.myapp.ClassementActivity
import com.example.myapp.FavorisActivity


class MainActivity : AppCompatActivity() {

    lateinit var monchamps: EditText
    lateinit var monbouton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        monbouton = findViewById(R.id.button)
        monchamps = findViewById(R.id.edit_text)
        monbouton.setOnClickListener {
            val intent = Intent(this, AffichageDesParolesActivity::class.java)
            val inputText = monchamps.text.toString()
            intent.putExtra("inputText", inputText)
            startActivity(intent)
        }
        val homeButton = findViewById<ImageButton>(R.id.home_button)
        val searchButton = findViewById<ImageButton>(R.id.search_button)
        val favoritesButton = findViewById<ImageButton>(R.id.favorites_button)
        val rankingButton = findViewById<ImageButton>(R.id.ranking_button)

        homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        searchButton.setOnClickListener {
            val intent = Intent(this, AffichageDesParolesActivity::class.java)
            startActivity(intent)
        }

        favoritesButton.setOnClickListener {
            val intent = Intent(this, FavorisActivity::class.java)
            startActivity(intent)
        }

        rankingButton.setOnClickListener {
            val intent = Intent(this, ClassementActivity::class.java)
            startActivity(intent)
        }
    }
}
