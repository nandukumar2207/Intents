package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
        //binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

    val button = findViewById<Button>(R.id.button)
    button.setOnClickListener{
            val intentOne =Intent(this,MainActivity2::class.java)
            startActivity(intentOne)
        }
    }
}