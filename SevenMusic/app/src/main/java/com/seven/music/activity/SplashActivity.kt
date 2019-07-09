package com.seven.music.activity

import android.content.Intent
import androidx.annotation.ColorLong
import kotlinx.android.synthetic.main.activity_splash.*
import com.bumptech.glide.Glide
import com.seven.music.R
import com.seven.music.util.PreUtil
import java.util.*


class SplashActivity : BaseActivity() {

    var timer = Timer()

    var countDownCount = 5

    val AD_URL = "https://music.yiroote.com/images/ads/ad720.jpg"

    override fun beforeInitView() {
        if (PreUtil.readBoolean(this,"IS_NOT_FIRST_LOGIN")!!){
            escapeSplash()
        }
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initView() {
        btn_escape.isEnabled = false
        btn_escape.setOnClickListener {
            escapeSplash()
            PreUtil.write(this, "IS_NOT_FIRST_LOGIN", true)
        }

        Glide.with(this).load(AD_URL).into(iv_ad);
    }

    private fun escapeSplash() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun initEvent() {
        timer.schedule(task, 1000, 1000)
    }

    private var task: TimerTask = object : TimerTask() {
        override fun run() {
            runOnUiThread {
                btn_escape.text = countDownCount.toString()
                countDownCount--
                if (countDownCount < 0) {
                    timer.cancel();
                    btn_escape.text = "跳过"
                    btn_escape.isEnabled = true
                }

            }
        }
    }

    override fun setStatusColor(@ColorLong long: Long) {
        super.setStatusColor(0xffD9EAF0)
    }
}
