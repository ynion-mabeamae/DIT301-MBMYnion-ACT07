package com.example.advanceduinavapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ProfileFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    // Inflate the layout directly without View Binding
    return inflater.inflate(R.layout.fragment_profile, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    // Setup ViewPager2 and TabLayout using findViewById
    val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)
    val viewPager = view.findViewById<ViewPager2>(R.id.viewPager)

    // Use requireActivity() instead of 'this' for the adapter
    val adapter = ProfilePagerAdapter(requireActivity())
    viewPager.adapter = adapter

    val tabTitles = listOf("Info", "Gallery")
    TabLayoutMediator(tabLayout, viewPager) { tab, position ->
      tab.text = tabTitles[position]
    }.attach()
  }
}