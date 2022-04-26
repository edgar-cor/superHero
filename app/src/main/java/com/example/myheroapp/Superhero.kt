package com.example.myheroapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

class Superhero (val name: String, val alterEgo: String, val bios: String, val power: Float) :
    Parcelable