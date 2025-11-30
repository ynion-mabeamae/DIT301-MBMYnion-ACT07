package com.example.advanceduinavapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    setupNavigation()
  }

  private fun setupNavigation() {
    val navController = findNavController(R.id.nav_host_fragment)
    val bottomNav = findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottom_nav)
    bottomNav.setupWithNavController(navController)
  }
}