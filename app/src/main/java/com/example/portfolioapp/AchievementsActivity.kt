package com.example.portfolioapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AchievementsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievements)

        val TextSummary = findViewById<TextView>(R.id.textSummary)

        val portSummary = "* Certified in OOPs and DSA using C++.\n" +
                "\"Achievements are not that much but i am currently working on my skills.\""
        TextSummary.text = portSummary

    }



}