package com.example.kunciisjawa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pindahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah)

        var kembaliBtn = findViewById<Button>(R.id.kembaliBtn)

        kembaliBtn.setOnClickListener {
            var register = Intent(this@pindahActivity,MainActivity::class.java)
            startActivity(register)
        }
    }
}