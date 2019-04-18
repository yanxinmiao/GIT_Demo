package com.example.kotlin

import android.util.Log

/**
 *
 * Crated by yxm on 19-3-22
 *
 * kotlin接口和Java8类似， 即可包含抽象方法，也可以包含实现。
 */
interface DemoInterface1 {

    //接口中的属性，要么声明为抽象，要么提供访问器的实现
    val num: Int

    val str: String
        get() = ""

    fun fun1(){
        Log.d("DemoInterface1","我是DemoInterface1中的fun1()")
    }

    //没有方法体默认为抽象
    fun fun2()
}