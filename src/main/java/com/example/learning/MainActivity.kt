 package com.example.learning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val watchNow = findViewById<Button>(R.id.onebutton)

        watchNow.setOnClickListener{

            // Open a new activity
            intent = Intent(applicationContext, secondActivity::class.java)
            startActivity(intent)
        }
    }
}