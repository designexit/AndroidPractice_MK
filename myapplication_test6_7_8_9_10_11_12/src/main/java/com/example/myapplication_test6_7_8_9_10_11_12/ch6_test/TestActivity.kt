package com.example.myapplication_test6_7_8_9_10_11_12.ch6_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication_test6_7_8_9_10_11_12.R
import com.example.myapplication_test6_7_8_9_10_11_12.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    lateinit var activityTestBinding: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_test)
        activityTestBinding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(activityTestBinding.root)

        activityTestBinding.frameBtn.setOnClickListener {
            activityTestBinding.frameBtn.visibility = View.INVISIBLE
            activityTestBinding.rose.visibility = View.VISIBLE
        }

        activityTestBinding.rose.setOnClickListener {
            activityTestBinding.frameBtn.visibility = View.VISIBLE
            activityTestBinding.rose.visibility = View.INVISIBLE
        }
    }
}