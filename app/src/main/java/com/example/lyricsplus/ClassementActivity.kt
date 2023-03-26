package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.lyricsplus.AffichageDesParolesActivity
import com.example.lyricsplus.MainActivity
import com.example.lyricsplus.R

class ClassementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classement)

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
