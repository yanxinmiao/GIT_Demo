package com.example.kotlin

/**
 *
 * Crated by yxm on 19-3-20
 */

/**
 * 包级函数 —— 和Java不同的是， kotlin中函数可以不定义在类中
 *
 * @JvmOverloads 添加上这个注解， 可以在Java代码中使用默认参数的方法
 *
 */
@JvmOverloads
fun sayHello(name: String = "hh") {
    println("Hello $name!")
}

const val name: String = ""