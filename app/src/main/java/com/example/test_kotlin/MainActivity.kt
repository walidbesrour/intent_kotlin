package com.example.test_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val a = "walid besrour from tunisia"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txt = mytxt.text.toString()
        new_btn.setOnClickListener {

            val intent = Intent(this,MainActivity2::class.java).apply {
                putExtra("wal",txt)
                println(a)
            }
            startActivity(intent)
        }
    }
}