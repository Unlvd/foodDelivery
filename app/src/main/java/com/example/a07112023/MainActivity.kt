package com.example.a07112023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.a07112023.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
  private lateinit var binding: ActivityMainBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    binding = ActivityMainBinding.inflate(layoutInflater)
    super.onCreate(savedInstanceState)
    installSplashScreen()
    setContentView(binding.root)
  if (savedInstanceState == null){
    supportFragmentManager.beginTransaction()
      .addToBackStack("Login")
      .add(R.id.container,LoginFragment(), "Login")
      .commitAllowingStateLoss()
  }

  }
}