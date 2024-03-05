package com.example.ficha1certa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AT1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at1)


        // Abrir AT2
        var button_at1=findViewById<Button>(R.id.myButton)

        button_at1.setOnClickListener {

            val intent = Intent(this, AT2::class.java)
            startActivity(intent)
        }
    }
}