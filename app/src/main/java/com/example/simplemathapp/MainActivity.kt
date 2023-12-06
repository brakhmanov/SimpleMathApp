package com.example.simplemathapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var questionView: TextView
    lateinit var answerView: EditText
    var correctAnswer: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        questionView = findViewById(R.id.questionView)
        answerView = findViewById(R.id.answerView)

        val button = findViewById<Button>(R.id.answerButton)

        button.setOnClickListener {
            handleAnswer()
        }

        setNewQuestion()

    }

    fun handleAnswer() {
        val answeredCorrect = checkAnswer()

        Log.d("!!!","Du svarade $answeredCorrect")

        
    }

    fun checkAnswer() : Boolean {
        // kolla vad användaren har svarat
        val answerText = answerView.text.toString()
        val answer = answerText.toIntOrNull()

        // jämföra användarens svar med rätta svaret
        return answer == correctAnswer
    }


    fun setNewQuestion() {
        val firstNumber = (1..10).random()
        val secondNumber = (1..10).random()

        correctAnswer = firstNumber + secondNumber
        questionView.text = "$firstNumber + $secondNumber ="

    }

}