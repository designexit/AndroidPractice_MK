package com.example.myapplication_test6_7_8_9_10_11_12.ch7_test

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.Toast
import com.example.myapplication_test6_7_8_9_10_11_12.R
import com.example.myapplication_test6_7_8_9_10_11_12.databinding.ActivityTest7Binding

class TestActivity_7 : AppCompatActivity() {
    lateinit var activityTest7Binding: ActivityTest7Binding
    lateinit var TAG : String
    override fun onCreate(savedInstanceState: Bundle?) {
        TAG = "KMK"
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_test7)
        // 모든 뷰 인스턴스들을 하나의 인스턴스에 모두담기
        activityTest7Binding = ActivityTest7Binding.inflate(layoutInflater)

        //모두 담은 인스턴스의 부모 레이아웃 출력
        setContentView(activityTest7Binding.root)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action){
            MotionEvent.ACTION_DOWN -> {
                Log.d(TAG, "Touch down event x:${event.x}, event rawX:${event.rawX}" +
                "event y:${event.y}, event rawY:${event.rawY}")
                Toast.makeText(this@TestActivity_7, "Touch down event", Toast.LENGTH_SHORT).show()
            }
            MotionEvent.ACTION_UP -> {
                Log.d(TAG, "Touch up event x:${event.x}, event rawX:${event.rawX}" +
                        "event y:${event.y}, event rawY:${event.rawY}")
                Toast.makeText(this@TestActivity_7, "Touch up event", Toast.LENGTH_SHORT).show()
            }
            MotionEvent.ACTION_MOVE -> {
                Log.d(TAG, "Touch up event x:${event.x}, event rawX:${event.rawX}" +
                        "event y:${event.y}, event rawY:${event.rawY}")
                //Toast.makeText(this@TestActivity_7, "Touch move", Toast.LENGTH_SHORT).show()
            }
        }

        return super.onTouchEvent(event)
    }
}