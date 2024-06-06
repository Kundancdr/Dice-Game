package com.example.diceroller

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform