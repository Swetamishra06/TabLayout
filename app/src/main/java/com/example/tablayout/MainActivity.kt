package com.example.tablayout

import ViewPagerAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout: TabLayout = findViewById(R.id.tablayout)
        val viewPager: ViewPager2 = findViewById(R.id.viewPager2)

        // Set up the ViewPager with an adapter
        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter

        // Link the TabLayout and ViewPager2
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "A Tablayout"
                1 -> "B Tablayout"
                else -> "C Tablayout"
            }
        }.attach()
    }
}
