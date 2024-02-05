package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { //onCreate 앱이 최초 실행됐을때 시행)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //xml 화면 View를 연결한다
        var text1 = findViewById<TextView>(R.id.title_txt) //text1 이라는 변경가능한 변수를 선언함과 동시에 TextView의 아이디를 연결  # binding을 통해 더욱 간결하게 가능

        text1.setText("hello~") // xml로 이동하지 않고 원하는 내용을 setText를 통해서 메시지의 내용을 변경할수있다
    }
}