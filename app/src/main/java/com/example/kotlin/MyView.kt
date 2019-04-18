package com.example.kotlin

import android.content.Context
import android.util.AttributeSet
import android.view.View
import java.util.jar.Attributes


/**
 *
 * 当子类无主构造函数时 ， 每个次构造函数必须使用super关键字初始化基类
 *
 */
class MyView : View {

    constructor(context: Context) : super(context)

    constructor(context: Context , attrs: AttributeSet?) : super(context , attrs)

    constructor(context: Context , attrs: AttributeSet? , deStyleAttr: Int) : super(context, attrs , deStyleAttr)

    init {
        dp2px(context , 2)
    }


}