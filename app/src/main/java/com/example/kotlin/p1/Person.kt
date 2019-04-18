package com.example.kotlin.p1

/**
 *
 * Crated by yxm on 19-3-19
 */

/**
 * 如果主构造函数没有任何注解或可见性修饰， constructor可以省略
 *
 *
 * 如果不声明主或次构造函数，默认会生成一个无参的主构造函数，public
 *
 *
 */
open class Person(private val firstName: String ) {

    /**
     * 主构造函数不能包含任何代码，初始化的代码可以放到以init关键字作为前缀的代码块中 ， 这个代码块可以有多个
     */
    init {
        val name = firstName.toUpperCase()
    }

    /**
     * 如果类有一个主构造函数，每个次构造函数都要委托给主构造函数，可以直接委托或通过其他的次构造函数间接委托，使用this
     *
     */
    constructor(age: Int , name: String) : this(name)

    constructor(age: Int , name: String, address: Int) : this(age , name)

    open fun drive(){

    }


}