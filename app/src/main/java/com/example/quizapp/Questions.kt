package com.example.quizapp

data class Questions(
    val id: Int,
    val questions : String,
    val image: Int,
    val optionsOne: String,
    val optionsTwo: String,
    val optionsThree: String,
    val optionsFour: String,
    val correctAnswer: Int
    )
