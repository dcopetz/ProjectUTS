package com.krisaditya.projectuts.MouseFragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.krisaditya.projectuts.MouseFragment.MLogitechFragment
import com.krisaditya.projectuts.MouseFragment.MRazerFragment
import com.krisaditya.projectuts.MouseFragment.MSteelseriesFragment


class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    //sebuah list yang menampung objek Fragment
    private val pages = listOf(
            MSteelseriesFragment(),
            MRazerFragment(),
            MLogitechFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    //judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "First Tab"
            1 -> "Second Tab"
            else -> "Third Tab"
        }
    }
}
