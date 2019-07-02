package com.seven.music

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

 abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (getLayoutId()!=0){
            setContentView(getLayoutId())
        }
        initView()
        initEvent()
    }


     abstract fun getLayoutId():Int

     abstract fun initView()

     abstract fun initEvent()


 }
