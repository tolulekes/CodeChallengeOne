package com.vog.recyclerdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.vog.recyclerdemo.databinding.LayoutFlowerBinding


class FlowerListAdapter(private val clickListener: FlowerClickListener) :
    ListAdapter<Flower, FlowerListAdapter.FlowerViewHolder>(FlowerDiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        return FlowerViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.bind(getItem(position), clickListener)
    }

    class FlowerViewHolder private constructor(val binding: LayoutFlowerBinding) :
        RecyclerView.ViewHolder(binding.root) {
        //These items must be specified as variables in the xml item layout file
        fun bind(
            item: Flower,
            clickListener: FlowerClickListener
        ) {
            binding.apply {
                flower = item
                this.clickListener = clickListener
                executePendingBindings()
            }
        }

        companion object {
            fun from(parent: ViewGroup): FlowerViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = LayoutFlowerBinding.inflate(layoutInflater, parent, false)
                return FlowerViewHolder(binding)
            }
        }
    }

    object FlowerDiffCallback : DiffUtil.ItemCallback<Flower>() {
        override fun areItemsTheSame(oldItem: Flower, newItem: Flower) = oldItem == newItem
        override fun areContentsTheSame(oldItem: Flower, newItem: Flower) = oldItem.name == newItem.name
    }
}

class FlowerClickListener(val clickListener: (item: Flower) -> Unit) {
    fun onClick(item: Flower) = clickListener(item)
}