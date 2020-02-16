package com.websarva.wings.android.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    var tList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener {
            val input = findViewById<EditText>(R.id.ET)
            val inputStr = input.text.toString()
            tList.add(inputStr)            // ここにボタンを押したとの処理を書く
        }
        show.setOnClickListener {
            val input = findViewById<EditText>(R.id.ET)
            val inputStr = input.text.toString()
            TV.setText(inputStr)
            ET.setText("")
            // ここにボタンを押したとの処理を書く
        }
        clear.setOnClickListener {
           tList.clear()
            TV.setText("")


            // ここにボタンを押したとの処理を書く
        }
        }

    }


