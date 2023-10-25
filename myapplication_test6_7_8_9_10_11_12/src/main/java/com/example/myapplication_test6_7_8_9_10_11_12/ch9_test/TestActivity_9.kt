package com.example.myapplication_test6_7_8_9_10_11_12.ch9_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication_test6_7_8_9_10_11_12.R
import com.example.myapplication_test6_7_8_9_10_11_12.ch6_test.TestActivity_6
import com.example.myapplication_test6_7_8_9_10_11_12.ch7_test.TestActivity_7
import com.example.myapplication_test6_7_8_9_10_11_12.databinding.ActivityTest9Binding

class TestActivity_9 : AppCompatActivity() {
    // Binding의 이름 규칙은 레이아웃 이름을 따라 감(자동생성)
    // 단, build.gradle에서 설정을 반드시 하고 (모듈버전)
    lateinit var activityTest9Binding: ActivityTest9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_test9)
        activityTest9Binding = ActivityTest9Binding.inflate(layoutInflater)
        setContentView(activityTest9Binding.root)

        activityTest9Binding.rectangle.setOnClickListener {
            Toast.makeText(this@TestActivity_9, "이미지 클릭됨", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@TestActivity_9, TestActivity_7::class.java)
            startActivity(intent)
        }

        // 소스 코드로 정적 자원 사용하기. 문자열
        activityTest9Binding.textView2.text = getString(R.string.app_intro)


    }
}