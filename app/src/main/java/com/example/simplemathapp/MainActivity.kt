package com.example.simplemathapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var questionView : TextView
    lateinit var answerView : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        questionView = findViewById(R.id.questionView)
        answerView = findViewById(R.id.answerView)


    }


    
}