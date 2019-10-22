package com.krisaditya.projectuts

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import com.krisaditya.projectuts.MouseFragment.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_mouse.*

class Mouse : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mouse)

        viewpager_main.adapter = MyPagerAdapter(supportFragmentManager)
    }
}
