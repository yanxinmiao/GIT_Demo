package com.example.kotlin.coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/**
 *
 * Crated by yxm on 19-4-4
 *
 * 本质上 ， 协程是轻量级的线程
 * 有些耗时操作，完成后需要通知UI， 一般使用回调， 现在使用一种避免阻塞线程， 并使用更廉价、更可控的操作代替阻塞线程， 协程挂起
 *
 * 协程通过将复杂性放入库来简化编程，程序的逻辑可以在协程中顺序表达，而底层库会为我们解决异步性，该库可以将用户代码包装回调、订阅相关事件、在不同线程上调度执行，而代码则保持如同按顺序执行一样
 *
 */

//fun main(){

//    GlobalScope.launch {
//
//        //delay 是挂起函数，并不会造成线程阻塞，而会造成协程挂起，并且只能在协程中使用。
//        delay(1000)
//        print("World!!")
//    }
//    println("Hello")
////    Thread.sleep(2000)
//    runBlocking {
//        delay(2000)
//    }
//}



fun main() = runBlocking<Unit> {

    launch {
        println("${Thread.currentThread().name}")
    }

    launch (Dispatchers.Unconfined){

        println("Unconfined = ${Thread.currentThread().name}")
    }

    launch(Dispatchers.Default) {
        println("Default = ${Thread.currentThread().name}")
    }

    launch (newSingleThreadContext("Custom")){
        println("Custom = ${Thread.currentThread().name}")
    }

    var i = 1
    val jobs = List(100_100){
        launch {
            delay(100)
            println("result=${i ++}")
        }
    }
}


suspend fun getResult1() : Int{
    delay(1000L)
    return 10
}

suspend fun getResult2() : Int{
    delay(1000L)
    return 15
}