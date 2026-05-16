package com.example.lab

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Set up the listener for window insets to apply edge-to-edge layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.buy1).setOnClickListener {
            showToast("You clicked Buy Now for Resort Shirt!")
        }

        findViewById<Button>(R.id.buy2).setOnClickListener {
            showToast("You clicked Buy Now for Rib-Knit Vest Top!")
        }

        findViewById<Button>(R.id.buy3).setOnClickListener {
            showToast("You clicked Buy Now for Jacquard-Weave Resort Shirt!")
        }

        findViewById<Button>(R.id.buy4).setOnClickListener {
            showToast("You clicked Buy Now for Relaxed Fit Trousers!")
        }

        findViewById<Button>(R.id.buy5).setOnClickListener {
            showToast("You clicked Buy Now for Super Baggy Jeans!")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
