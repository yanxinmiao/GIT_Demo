package com.example.kotlin

/**
 *
 * Crated by yxm on 19-3-22
 */
abstract class Lanuage {

    val TAG = this.javaClass.name

    abstract var name: String

    abstract fun init()
}