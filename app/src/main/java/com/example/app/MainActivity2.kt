package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.app.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
   setContentView(R.layout.activity_main2)

        val nextBtn = findViewById<Button>(R.id.nextBtn)
        nextBtn.setOnClickListener {  val intentTwo =Intent(this,MainActivity3::class.java)
            startActivity(intentTwo) }

         }
    }
