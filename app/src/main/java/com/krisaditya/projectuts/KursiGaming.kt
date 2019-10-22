package com.krisaditya.projectuts

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import com.krisaditya.projectuts.KursiGamingFragment.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_kursi_gaming.*

class KursiGaming : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kursi_gaming)
        viewpager_main.adapter = MyPagerAdapter(supportFragmentManager)
    }
}
