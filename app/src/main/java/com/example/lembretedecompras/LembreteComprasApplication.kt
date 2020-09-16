package com.example.lembretedecompras

import android.app.Application
import com.facebook.stetho.Stetho

class LembreteComprasApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
        }
    }
}