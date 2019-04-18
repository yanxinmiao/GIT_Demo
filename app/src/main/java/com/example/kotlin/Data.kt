package com.example.kotlin

/**
 *
 * Crated by yxm on 19-3-22
 */
class Data constructor(num: Int){

    //初始化代码放在init 代码块中， 可以使用构造函数中的参数
    init {
        print(num)
    }

    constructor(num: Int , num1: Int) : this(num)
}