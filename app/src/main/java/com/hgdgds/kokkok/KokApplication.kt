package com.hgdgds.kokkok

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class KokApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
