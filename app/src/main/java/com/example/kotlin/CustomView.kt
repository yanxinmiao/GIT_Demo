package com.example.kotlin

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 *
 * 当子类中存在主构造函数时， 主构造函数一般实现基类中参数最多的那个， 参数少的次构造函数用this关键字引用
 *
 *  类默认是final的， 不能被继承
 *
 *  使用open修饰的类可以被继承
 *
 */
class CustomView(context: Context?, attrs: AttributeSet?, defStyleAttr: Int ,data: Data?) : View(context, attrs, defStyleAttr) {


    constructor(context: Context?) : this(context, null, 0,null)

    constructor(context: Context?, attrs: AttributeSet?) : this(context , attrs ,0 , null)

}