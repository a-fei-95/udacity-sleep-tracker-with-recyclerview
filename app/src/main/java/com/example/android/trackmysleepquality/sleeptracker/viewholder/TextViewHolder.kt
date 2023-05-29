package com.example.android.trackmysleepquality.sleeptracker.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.android.trackmysleepquality.R

class TextViewHolder(view: View) : ViewHolder(view) {
    companion object {
        fun from(parent: ViewGroup): TextViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val view = layoutInflater.inflate(R.layout.header, parent, false)

            return TextViewHolder(view)
        }
    }
}