package com.seven.music

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    val musicUrl ="https://music.yiroote.com"
    override fun initEvent() {
    }


    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        wv_music.loadUrl(musicUrl)
    }
}
