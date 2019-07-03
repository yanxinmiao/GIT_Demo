package com.example.kotlin.coroutine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlin.R
import kotlinx.android.synthetic.main.activity_main6.*
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class Main6Activity : AppCompatActivity(),CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() =  Dispatchers.Main + job

    //用于管理activity中全部的coroutine
    private val job = SupervisorJob()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)


        launch {

            delay(1000)
            Log.d("Main6Activity","Kotlin Coroutines World")
        }
        Log.d("Main6Activity","Hello")

    }


    override fun onDestroy() {
        super.onDestroy()
        //取消所有的操作
        coroutineContext.cancel()
    }
}
