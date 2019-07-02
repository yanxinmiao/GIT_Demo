package com.example.kotlin.coroutine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Kotlin 协程相关demo
 *
 *  协程可以视为轻量级的线程，和线程一样，协程可以并行、等待其他协程和通信
 *
 *  协程
 *
 *  目前官方提供的构造器有两个
 *
 *  lunch —— 不会阻塞当前线程，并返回一个协程引用
 *
 *  runBlocking —— 会阻塞当前线程，会等待协程的代码执行完，再执行下面的代码。
 *
 *
 *  协程使用 suspend 代替线程阻塞，可以理解为无阻塞式的异步编程，用更轻量的协程代替繁重的阻塞操作。
 *
 *  coroutine 都是运行在CoroutineContext 上下文中，
 *
 *
 *
 */
class CoroutineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutine)

        println("start....")

        //启动一个协程
        GlobalScope.launch {
            //delay 不会阻塞当前线程， 只会挂起当前协程
            delay(1000)
            println("Hello !")
        }

        //启动一个协程，并等待直到结束
        runBlocking {
            delay(2000)
        }
//        Thread.sleep(2000)
        println("Stop")

    }
}
