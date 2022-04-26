package com.example.myheroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myheroapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener {
            val superHeroName = binding.heroNameEdit.text.toString()
            val alterEgo = binding.heroEgoEdit.text.toString()
            val bio = binding.bioEdit.text.toString()
            val power = binding.ratingBar.rating

            val hero = Superhero( superHeroName, alterEgo, bio, power )
            openDetailActivity(hero)
        }
    }

    private fun openDetailActivity(superhero: Superhero) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.SUPERHERO_KEY, superhero)
        startActivity(intent)
    }
}