package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SquareActivity : AppCompatActivity() {

    private lateinit var squareCountText: TextView
    private lateinit var backButton: Button

    companion object {
        const val COUNT = "count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)
        squareCountText = findViewById(R.id.square_count)
        showSquareCount()
        Log.i("SquareActivity", "onCreate")
        backButton = findViewById(R.id.back_button)
        backButton.setOnClickListener{ this.finish() }
    }

    private fun showSquareCount() {
        val count = intent.getIntExtra(COUNT, 0)
        squareCountText.text = (count * count).toString()
    }

    override fun onStart() {
        super.onStart()
        Log.i("SquareActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("SquareActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("SquareActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("SquareActivity", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("SquareActivity", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("SquareActivity", "onDestroy")
    }
}