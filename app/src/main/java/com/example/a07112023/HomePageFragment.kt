package com.example.a07112023

import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.a07112023.databinding.FragmentHomePageBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.search.SearchView

class HomePageFragment:Fragment(R.layout.fragment_home_page) {
  private lateinit var binding: FragmentHomePageBinding
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = FragmentHomePageBinding.inflate(inflater,container,false)
    replaceFragment(HomeFragment())
    return binding.root


  }
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

   // val bottomNavigationView = binding.menu.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
   // val navigationView = findNavController(R.id.frame_layout)

    val button = binding.constraintLayout.findViewById<ImageButton>(R.id.search_button)
    val toolbar = binding.constraintLayout.findViewById<ConstraintLayout>(R.id.toolbar)
    val searchbar = binding.constraintLayout.findViewById<ConstraintLayout>(R.id.search_bar)
    val closeButton = binding.constraintLayout.findViewById<ImageView>(R.id.close_button)
    val fab = binding.menu.findViewById<FloatingActionButton>(R.id.fab)

    fab.setOnClickListener {
      replaceFragment(CartFragment())
    }

    button.setOnClickListener {
        toolbar.visibility = View.GONE
        searchbar.visibility = View.VISIBLE
    }

    closeButton.setOnClickListener {
      toolbar.visibility = View.VISIBLE
      searchbar.visibility = View.GONE
    }

    binding.menu.findViewById<BottomNavigationView>(R.id.bottomNavigationView).setOnItemSelectedListener{

      when(it.itemId){
        R.id.home -> replaceFragment(HomeFragment())
        R.id.user -> replaceFragment(UserFragment())
        R.id.wishlist -> replaceFragment(WishListFragment())
        R.id.orders -> replaceFragment(OrdersFragment())
        else -> {
      }
    }
      true
    }

  }
  private fun replaceFragment(fragment: Fragment){
    val fragmentManager = parentFragmentManager
    val fragmentTransaction = fragmentManager.beginTransaction()
    fragmentTransaction
      .addToBackStack("Home")
      .replace(R.id.frame_layout,fragment,"Home")
      .commitAllowingStateLoss()
  }

}

