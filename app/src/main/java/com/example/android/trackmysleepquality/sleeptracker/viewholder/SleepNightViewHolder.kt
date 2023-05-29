package com.example.android.trackmysleepquality.sleeptracker.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.android.trackmysleepquality.database.SleepNight
import com.example.android.trackmysleepquality.databinding.ListItemSleepNightBinding
import com.example.android.trackmysleepquality.sleeptracker.utils.SleepNightListener

internal class SleepNightViewHolder private constructor(
    val binding: ListItemSleepNightBinding
) : ViewHolder(binding.root) {

    fun bind(item: SleepNight, clickListener: SleepNightListener) {
        binding.sleep = item
        binding.clickListener = clickListener
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): SleepNightViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ListItemSleepNightBinding.inflate(layoutInflater, parent, false)

            return SleepNightViewHolder(binding)
        }
    }
}