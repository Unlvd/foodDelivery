package com.example.a07112023

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a07112023.databinding.FragmentRegisterBinding

class RegisterFragment: Fragment(R.layout.fragment_register) {
  private lateinit var binding: FragmentRegisterBinding

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = FragmentRegisterBinding.inflate(inflater,container,false)
    return binding.root
  }
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.button.setOnClickListener {
      parentFragmentManager.beginTransaction()
      .addToBackStack("Login")
      .replace(R.id.container,LoginFragment(), "Login")
      .commitAllowingStateLoss() }

  }

}