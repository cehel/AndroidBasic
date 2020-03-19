package com.zuhlke.basicandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zuhlke.basicandroid.CountResultActivity.Companion.COUNT_KEY
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

        goToResult.setOnClickListener{
            val intent = Intent(this, CountResultActivity::class.java).apply {
                putExtra(COUNT_KEY, count)
            }
            startActivity(intent)
        }
    }

    fun updateCount(){
        tv_count.text = count.toString()
    }
}
