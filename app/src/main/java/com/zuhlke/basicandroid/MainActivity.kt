package com.zuhlke.basicandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateCount()

        buttonCount.setOnClickListener {
            count++
            updateCount()
        }
    }

    fun updateCount(){
        tv_count.text = count.toString()
    }
}
