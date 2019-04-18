package com.example.kotlin

/**
 *
 * Crated by yxm on 19-3-21
 *
 * 可见性修饰符，
 * public 默认使用这个
 *
 * internal
 *
 * protected 私有 + 子类
 *
 * private
 *
 * 有不同的引用范围
 *
 *
 */
class Test (val name: String) : DemoInterface1 , DemoInterface2 ,DemoInterface3{
    override fun fun2() {

    }

    override val num: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun fun1() {

        super<DemoInterface1>.fun1()

        super<DemoInterface2>.fun1()
    }

    constructor(name: String ,age: Int) : this(name)
}