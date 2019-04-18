package com.example.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*
import kotlin.contracts.Returns

class Main3Activity : AppCompatActivity() {

    private val p: Person? = Person("")

    private val p1: Person? = null

    //全局变量在定义时要初始化
    var b: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //局部变量在定义时可以先不初始化
        var a: Int

        val list = listOf(1,"2",true)

        val ls = mutableListOf<Any>()
        ls.add("s")


        tv_test.text = "kotlin"

        tv_test.setOnClickListener{

        }

        p.let {

        }

        p?.drive()

        p1?.drive()


        b!!.length

    }

    fun sum(a: Int,b: Int) = if (a + b > 10) a else b

}
