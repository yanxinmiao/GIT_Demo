package com.example.kotlin

/**
 *
 * Crated by yxm on 19-3-22
 *
 * 抽象类的实现类， 必须实现全部带有abstract 修饰的属性和方法
 *
 */
class TestA() : Lanuage() {
    override var name: String
        get() = "kotlin"
        set(value) {}

    override fun init() {


    }

    /**
     * 定义在类中的类， 嵌套类
     */
    class Nested{
        fun init(){

        }
    }

    /**
     * 内部类， 用inner修饰 ，外部类().内部类().内部类方法/属性
     */
    inner class InnerClass{
        fun init(){

        }
    }
}