package com.vog.recyclerdemo

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("list")
fun <T, VH: RecyclerView.ViewHolder> RecyclerView.list(result: List<T>?) {
    if (result != null) (adapter as ListAdapter<T, VH>?)?.submitList(result)
}