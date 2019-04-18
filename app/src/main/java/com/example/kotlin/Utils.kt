package com.example.kotlin

import android.content.Context
import android.widget.Toast

/**
 *
 * Crated by yxm on 19-3-19
 */

/**
 *
 *
 *
 * 扩展函数 + 默认参数 ，可以直接为一个类扩展方法
 */
fun Context.toast(msg: String , type: Int = Toast.LENGTH_LONG){

    //this关键字在扩展函数内部 代表接受者对象， 即Context
    android.widget.Toast.makeText(this , msg , type).show()

}

fun String.last() : Char{
    return this[this.length - 1]
}

//扩展属性
val String.lastChar: Char
    get() = get(length - 1)


val a: Int = 10

val b = 20

const val C: String = ""

