package com.example.myheroapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myheroapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {
        const val SUPERHERO_KEY = "superhero"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding  = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras!!
        val superHeroName = bundle.getParcelable<Superhero>(SUPERHERO_KEY)!!

        binding.heroName.text = superHeroName.name
        binding.alterEgo.text= superHeroName.alterEgo
        binding.bioText.text = superHeroName.bios
        binding.ratingBar.rating = superHeroName.power

    }
}