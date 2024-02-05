package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { //onCreate 앱이 최초 실행됐을때 시행)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}