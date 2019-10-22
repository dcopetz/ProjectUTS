package com.krisaditya.projectuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.krisaditya.projectuts.KeyboardFragment.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_headset.*

class Keyboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keyboard)

        viewpager_main.adapter = MyPagerAdapter(supportFragmentManager)
    }
}
