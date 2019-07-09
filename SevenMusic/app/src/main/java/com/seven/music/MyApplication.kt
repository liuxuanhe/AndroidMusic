package com.seven.music

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.seven.music.util.PreUtil

class MyApplication : Application() {
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}
