package com.seven.music.activity

import android.annotation.SuppressLint
import androidx.annotation.ColorLong
import com.seven.music.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun beforeInitView() {

    }

    private val musicUrl = "https://music.yiroote.com"

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun initView() {
        wv_music.loadUrl(musicUrl)
    }

    override fun initEvent() {

    }

    override fun setStatusColor(@ColorLong long: Long){
        super.setStatusColor(0xff242124)
    }

}
