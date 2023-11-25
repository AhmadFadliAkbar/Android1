package com.example.kunciisjawa

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object{
        var NAMA = "nama"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et_input = findViewById<EditText>(R.id.et_input)
        var submitBtn = findViewById<Button>(R.id.submitBtn)
        var pindah = findViewById<Button>(R.id.pindah)
        var dialBtn = findViewById<Button>(R.id.dialBtn)

        submitBtn.setOnClickListener {
            var nama = et_input.text.toString()
            var submit = Intent(this@MainActivity,operData::class.java)
            submit.putExtra(NAMA,nama)
            startActivity(submit)
        }

        pindah.setOnClickListener {
            var register = Intent(this@MainActivity,pindahActivity::class.java)
            startActivity(register)
        }

        dialBtn.setOnClickListener {
            var Dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:0811212333"))
            startActivity(Dial)
        }

    }
}