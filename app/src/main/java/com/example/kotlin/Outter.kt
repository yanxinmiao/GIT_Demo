package com.example.kotlin

/**
 *
 * Crated by yxm on 19-3-19
 */
class Outer {

    val bar: Int = 1

    /**
     * 被inner修饰的内部类 ，可以访问外部类的变量
     */
    inner class Nested{
        fun foo() = bar
    }

}