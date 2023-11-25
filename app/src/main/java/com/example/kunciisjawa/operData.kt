package com.example.kunciisjawa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class operData : AppCompatActivity() {
    companion object{
        var NAMA = "nama"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oper_data)

        var tv_output = findViewById<TextView>(R.id.tv_output)
        var hasil = intent.getStringExtra(NAMA)
        var backBtn = findViewById<Button>(R.id.backBtn)

        tv_output.text = hasil

        backBtn.setOnClickListener {
            var register = Intent(this@operData,MainActivity::class.java)
            startActivity(register)
        }
    }
}