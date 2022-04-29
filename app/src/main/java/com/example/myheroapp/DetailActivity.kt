package com.example.myheroapp

import android.app.Activity
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myheroapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {
        const val SUPERHERO_KEY = "superhero"
        const val BITMAP_KEY = "bitmap"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding  = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras!!
        val superHeroName = bundle.getParcelable<Superhero>(SUPERHERO_KEY)!!
        val bitmap = bundle.getParcelable<Bitmap>(BITMAP_KEY)!!

        binding.imageView.setImageBitmap(bitmap)
        binding.superHero = superHeroName

    }
}