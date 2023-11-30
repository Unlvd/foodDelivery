package com.example.a07112023

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a07112023.databinding.FragmentHomeBinding

class HomeFragment:Fragment(R.layout.fragment_home) {
  private lateinit var binding: FragmentHomeBinding
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = FragmentHomeBinding.inflate(inflater,container,false)
    return binding.root
  }
}