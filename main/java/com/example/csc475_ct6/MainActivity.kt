package com.example.csc475_ct6

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var tvSteps: TextView
    private lateinit var tvCalories: TextView
    private lateinit var btnTrackActivity: Button

    private var steps = 1
    private var caloriesBurned = 50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        tvSteps = findViewById(R.id.tvSteps)
        tvCalories = findViewById(R.id.tvCalories)
        btnTrackActivity = findViewById(R.id.btnTrackActivity)

        btnTrackActivity.setOnClickListener {
            // Simulate tracking an activity
            steps += 1
            caloriesBurned += 50

            updateUI()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateUI() {
        tvSteps.text = "Steps: $steps"
        tvCalories.text = "Calories burned: $caloriesBurned kcal"
    }
}