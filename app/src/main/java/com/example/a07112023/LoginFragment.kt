package com.example.a07112023

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.example.a07112023.databinding.FragmentLoginBinding



class LoginFragment : Fragment() {
  private lateinit var binding: FragmentLoginBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = FragmentLoginBinding.inflate(inflater,container,false)
    binding.textView2.setOnClickListener {
        parentFragmentManager.beginTransaction()
          .addToBackStack("Register")
          .replace(R.id.container,RegisterFragment(), "Register")
          .commitAllowingStateLoss()

    }
    binding.button.setOnClickListener {
      parentFragmentManager.beginTransaction()
        .replace(R.id.container,HomePageFragment())
        .commitAllowingStateLoss()
    }
    val callback = object :  OnBackPressedCallback(true){
      override fun handleOnBackPressed() {
        if(isEnabled){
          isEnabled = false
          requireActivity().onBackPressedDispatcher
        }
      }

    }
    return binding.root
  }


  companion object {
    @JvmStatic
    fun newInstance() =
      LoginFragment()
  }
}