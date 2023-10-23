package com.example.myapplication_test5

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var imgCheck : String
    lateinit var TAG : String

    // 뷰 바인딩 설정 1
    lateinit var binding:
    override fun onCreate(savedInstanceState: Bundle?) {
        imgCheck="Y"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 기본 뷰 선택 방법 1
        val loginBtn : Button = findViewById(R.id.loginBtn)

        val shBtn : Button = findViewById(R.id.shBtn)
        shBtn.setOnClickListener {
            val imgView: ImageView = findViewById(R.id.mainImg)
        }


        // 기본 뷰 선택 방법 2
        loginBtn.setOnClickListener{
            val intent = Intent(this@MainActivity, LoginActivity)
        }
    }
}