package com.example.android.trackmysleepquality.sleeptracker.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.android.trackmysleepquality.sleeptracker.data.DataItem

internal class SleepNightDiffCallback: DiffUtil.ItemCallback<DataItem>() {
    override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem == newItem
    }
}