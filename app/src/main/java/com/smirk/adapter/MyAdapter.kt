package com.smirk.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.smirk.fragments.PhotosFragment


class MyAdapter(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {
  
    // this is for fragment tabs  
    override fun getItem(position: Int): Fragment {
        when (position) {  
            0 -> {  
              //  val homeFragment: HomeFragment = HomeFragment()  
                return PhotosFragment()
            }  
            1 -> {  
                return PhotosFragment()
            }  
           /* 2 -> {
               // val movieFragment = MovieFragment()  
                return PointTableFragment()
            }*/

            2-> {
                // val movieFragment = MovieFragment()
                return PhotosFragment()
            }
            else -> return PhotosFragment()
        }  
    }  
  
    // this counts total number of tabs  
    override fun getCount(): Int {  
        return totalTabs  
    }  
}  