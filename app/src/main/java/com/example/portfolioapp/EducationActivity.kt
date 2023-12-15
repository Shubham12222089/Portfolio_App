package com.example.portfolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class EducationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education2)

        val edu5 = findViewById<TextView>(R.id.edu1)
        val textedu1 = "* Scored 89.8% in 10th."
        edu5.text = textedu1

        val edu6 = findViewById<TextView>(R.id.edu2)
        val textedu2 = "* Scored 79.6% in 12th."
        edu6.text = textedu2

        val edu7 = findViewById<TextView>(R.id.edu3)
        val textedu3 = "* I am currently pursuing B.tech from Lovely Professional University."
        edu7.text = textedu3

    }
}