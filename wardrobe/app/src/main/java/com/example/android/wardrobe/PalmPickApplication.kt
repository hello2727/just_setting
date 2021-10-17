package com.example.android.wardrobe

import android.app.Application
import android.content.res.Configuration

/**
 * Created by Jihye Noh
 * Date: 2021-10-17
 */
class PalmPickApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }

    override fun onTerminate() {
        super.onTerminate()
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }
}