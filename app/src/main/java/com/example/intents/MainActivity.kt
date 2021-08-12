package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnText)
        val button2 = findViewById<Button>(R.id.btnExplicitText)
        val button3 = findViewById<Button>(R.id.btnImplicitText)
        val context = this

        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java);
            intent.putExtra("data", "test data")
            startActivity(intent)
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener {
            val intent = Intent (context, MainActivity::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            var intentImplicit = Intent(Intent.ACTION_SEND)
            intentImplicit.putExtra(Intent.EXTRA_TEXT, "CodeAndroid")
            intent.type = "text/plain"
            startActivity(intentImplicit)
        }
    }
}