package com.smirk.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.smirk.fragments.BioFragment
import com.smirk.fragments.LaughFragment
import com.smirk.fragments.PhotosFragment


class MyAdapterThumb(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {
  
    // this is for fragment tabs  
    override fun getItem(position: Int): Fragment {
        when (position) {  
            0 -> {  
              //  val homeFragment: HomeFragment = HomeFragment()  
                return BioFragment()
            }  
            1 -> {  
                return LaughFragment()
            }

            2-> {
                // val movieFragment = MovieFragment()
                return BioFragment()
            }
            else -> return BioFragment()
        }  
    }  
  
    // this counts total number of tabs  
    override fun getCount(): Int {  
        return totalTabs  
    }  
}  