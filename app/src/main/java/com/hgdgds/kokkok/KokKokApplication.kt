package com.hgdgds.kokkok

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class KokKokApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}