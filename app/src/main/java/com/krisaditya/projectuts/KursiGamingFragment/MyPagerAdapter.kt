package com.krisaditya.projectuts.KursiGamingFragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.krisaditya.projectuts.KursiGamingFragment.KursiDxrFragment
import com.krisaditya.projectuts.KursiGamingFragment.KursiRexusFragment
import com.krisaditya.projectuts.KursiGamingFragment.KursiSadesFragment

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    //sebuah list yang menampung objek Fragment
    private val pages = listOf(
            KursiSadesFragment(),
            KursiRexusFragment(),
            KursiDxrFragment()
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
