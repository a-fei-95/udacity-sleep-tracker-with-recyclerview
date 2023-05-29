package com.example.android.trackmysleepquality.sleeptracker.data

import com.example.android.trackmysleepquality.database.SleepNight

sealed class DataItem {
    data class SleepNightItem(val sleepNight: SleepNight) : DataItem() {
        override val id = sleepNight.nightId
    }

    object Header : DataItem() {
        override val id = Long.MIN_VALUE
    }

    abstract val id: Long
}