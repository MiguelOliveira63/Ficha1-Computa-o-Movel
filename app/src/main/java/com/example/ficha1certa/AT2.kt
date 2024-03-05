package com.example.ficha1certa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ficha1certa.R

class AT2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at2)

        // Fechar
        var button_at2=findViewById<Button>(R.id.myButton)

        button_at2.setOnClickListener {

            finish()
        }
    }
}