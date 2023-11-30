package com.example.a07112023.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a07112023.R
import com.example.a07112023.data.Category

class CategoryAdapter(
  private val context: Context,
  private val categoryList: ArrayList<Category>
): RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {


  override fun onCreateViewHolder(
    parent: ViewGroup,
    viewType: Int
  ): CategoryAdapter.CategoryViewHolder {
    val view = LayoutInflater.from(context).inflate(R.layout.category_container,parent, false)
    return CategoryViewHolder(view)
  }

  override fun onBindViewHolder(holder: CategoryAdapter.CategoryViewHolder, position: Int) {
    holder.id.text = categoryList[position].id.toString()
    holder.name.text = categoryList[position].name
  }

  override fun getItemCount(): Int {
    return categoryList.size
  }

  class CategoryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
      val id = itemView.findViewById<TextView>(R.id.textViewId)
      val name = itemView.findViewById<TextView>(R.id.textView)
  }
}