package com.example.kotlin

/**
 *
 * Crated by yxm on 19-3-19
 */
class User : Person{

    var age: Int? = null
        get() {
            if (field != null) {
                if (field!! > 10) return field
            }
            return 0
        }
        set(value) {
            if (value != null) {
                if (value > 0) field = value
            }
        }

    constructor(name: String) : super(name)

    override fun drive() {
        super.drive()


    }


    companion object {

        /**
         * 在Java中是静态的， Java代码中可以直接调用
         *
         * 使用了@JvmStatic注解，编译器会在相应对象的类中生成静态方法 和 实例方法
         *
         */

        @JvmStatic fun sing(){}

        fun study(){}
    }

}