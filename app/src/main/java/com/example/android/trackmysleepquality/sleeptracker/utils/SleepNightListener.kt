package com.example.android.trackmysleepquality.sleeptracker.utils

import com.example.android.trackmysleepquality.database.SleepNight

internal class SleepNightListener(val clickListener: (sleepId: Long) -> Unit) {
    fun onClick(night: SleepNight) = clickListener(night.nightId)
}