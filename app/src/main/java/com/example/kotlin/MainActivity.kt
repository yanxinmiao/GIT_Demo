package com.example.kotlin

import android.content.Intent
import android.os.Bundle
import android.provider.Contacts
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //创建实体，
//        val person = Person("name")

//        Log.d(TAG , "person=$person")
        val p1: Person? = null

       Log.d(TAG,"============ ${p1.toString()}")

        val p2 = com.example.kotlin.p2.Person("p2")


        "Kotlin".lastChar

        toast("1111")

        toast("sss" , type = Toast.LENGTH_LONG)

        toast("toast", Toast.LENGTH_LONG)


        val box = Box("A")
        box.value

        val value = Outer().Nested().foo()

        Obj.foo()

        //匿名内部类
        val listener = View.OnClickListener{

        }
        tv_hello.setOnClickListener {

        }

        reformat("str" , wordSeparator = 'a')

        val array = arrayOf("1" , "1")
        //使用spread 操作符* ，将一个数据传递给 可变参数
        add(*array , a = 2)

        add("1","2","2" , a = double(2))

        //创建一个不可变的list ，只有可读属性 ， kotlin没有专门创建list的语法结构
        var items = listOf("1" ,"2")

        //创建一个可变的list
        val list = mutableListOf("2","#")
        list.add("22")

        val users: List<Person> = mutableListOf<User>()


        //this 表达式
        this@MainActivity

        tv_hello.setOnClickListener {

            val intent = Intent(this@MainActivity , Main2Activity::class.java)
        }

        val u1 = User(name = "2")
        val u2 = User(name = "3")

        // == 比较内容， === 比较地址引用
        Log.d(TAG, "==${u1 == u2}")
        Log.d(TAG, "===${u1 === u2}")

        val a = "abc"
        print(a.length)

        tv_hello.setOnClickListener { it.id }

        a.sumBy { it.toInt() }

        val b: String? = ""
        Log.d(TAG ,"b = ${b?.length}")

        //elvis操作符 ?: 当且仅当左侧为空时， 才返回右侧的值
        val length = b?.length ?: -1

        if (u1 === u2){

        }

//        !! 操作符 —— 非空断言运算符，将任何值转换为非空

        val l = b!!.length


        //安全的类型转换 ， 转换失败返回null ， 不会抛异常
        val n = a as? Int


        val arrays = ArrayList<String>()
        for (item in arrays){
            print(item)
        }

        val arrayExample = JavaArrayExample()
        val ids = intArrayOf()
        arrayExample.remove(*ids)

        val intent = Intent(this , Main2Activity::class.java)

        JavaArrayExample.removeAll()

        coroutine1()

        btn_send.setOnClickListener {
            coroutineSend()
        }


        dp2px(this, 2)

        sayHi("")

        val colors = listOf("","")

        print("name,$b")

        sayHello()

        var s = fun(x: Int) : Int{
            return x * 10
        }

        //lambda 表达式 ， 其实就是匿名函数
        var sum = { x: Int -> x * 10 }

        //高阶函数 —— 其实就是函数，只不过参数是函数， 或返回值是函数

        //传递有名称的参数
        doctor(::hello)

        //传递lambda
        doctor { println("hello") }

        val name = ""
        val length1 = name.length


        //表达式不为空时 才执行 指定代码块
        name.let {

        }

        val lambda = {a: Int -> "${a}hh"}

        //invoke() 通过函数变量调用本身 ， lambda就是一个匿名函数
        print(lambda.invoke(2))

        val test = {a: Int , b:Int -> a + b}

        val st = test(2,2)
        print(test(2 ,3))

        "aa".sumBy(::selector)

        "dd".sumBy { it.toInt() }

        for (i in 1 .. 10){

        }

        val str: String? = null

        Log.d(TAG , "== ${str?.let { str.length }}")

        //访问枚举常量
        Direction.EAST.name


        val t = Test("")
        t.fun1()


        val result = if (a > b){
            print("a > b")
            a
        }else {
            print("a <=b")
            b
        }

        //调用嵌套类 , 嵌套类需要实例化 。外部类.嵌套类().嵌套类方法/属性
        TestA.Nested().init()

        //调动内部类,在调用的时候内部类 外部类都需要实例化
        TestA().InnerClass().init()

        val ls = listOf(1,3,3,42,5,3)
        for (value in ls){
            print("item:$value")
        }

        for (index in ls.indices){
            print("item=${ls[index]}")
        }

        compute(index = 2, value = "#")

    }

    private fun selector(char: Char) = char.toInt() + 10

    private fun hello(){
        print("hello")
    }

    fun compute(index: Int, value: String) {

    }

    private fun doctor(func: () -> Unit){

        fun funcPlus(){
            print("start")
            func()
            print("end")
        }

        return funcPlus()
    }


    /**
     * : 加() 表示 这个函数的返回值是一个函数
     *
     * -> Unit 这个是返回值函数对应的 返回值类型
     *
     * 闭包 —— 函数里生命函数，或者函数的返回值是函数
     */
    fun testq(): (a1: Int) -> Unit{
        var a = 3
        return fun (a1){
            a ++
            print("a = $a$a1")
        }
    }

    /**
     * 使用协程模拟网络请求
     */
    private fun coroutineSend(){

        /**
         * 1、 先创建了一个CoroutineScope ， 所有的协程都运行在CoroutineScope中
         * 2、 调用launch启动协程
         *
         *  当函数的最后一个参数是lambda表达式时，可以写到()的外面
         *
         *  采用协程的方式，可以让协程等待另一个协程，哪怕另外一个协程还属于另外一个线程
         *
         */
        val netScope = CoroutineScope(Dispatchers.Main)
        netScope.launch {
            Log.d(TAG,"Thread${Thread.currentThread().name}")
            pb.visibility = View.VISIBLE
            tv_hello.visibility = View.GONE

            /**
             * async又启动了一个协程，Dispatchers.Default这个协程调度器，它将使协程在执行时使用work-1 线程
             */

            val deffer = async(Dispatchers.Default) {
                getResult()
            }

            /**
             * Deferred 调用await方法可以阻塞执行流，到协程执行完毕返回结果
             *
             *
             */

            val result = deffer.await()
            tv_hello.text = result
            tv_hello.visibility = View.VISIBLE
            pb.visibility = View.GONE
        }

    }

    private suspend fun getResult(): String {
        Log.d(TAG,"getResult Thread${Thread.currentThread().name}")
        delay(5000)
        return "使用协程获取到的数据"
    }


    private fun coroutine1() {

        GlobalScope.launch{//创建并启动一个协程
            delay(1000)
            Log.d(TAG ,"World")
        }
        Log.d(TAG ,"Hello")
        Thread.sleep(2000)

    }


    private fun getMax(a: Int , b: Int) : Int{

        when(a){
            1 , 2 -> print("a=$a")
        }

        return if (a > b) a else b
    }

    private fun getResults() : String{
        return ""
    }

    /**
     * 成员函数
     */
    private fun reformat(str: String,
                         normalizeCase: Boolean = true,
                         upperCaseFirstLetter: Boolean = true,
                         divideByCamelHumps: Boolean = false,
                         wordSeparator: Char = ' ') {
    }

    //单表达式函数， 当函数体是单个表达式， 花括号可以省略 ， 函数的返回值类型 也可以根据返回值推断 ，可以省略
    private fun double(x: Int) = x * 2

    /**
     * 可变参数使用vararg 修饰， 只有一个参数可以标注为 vararg
     */
    private fun add(vararg str: String ,a: Int) : String{

        return "$a$str"
    }

    /**
     * 泛型函数 ， 在 函数名前使用<>
     */
    fun <T> singletonList(t: T){}


    fun compute(value: String , name: String){
        fun check(n: String){
            if (TextUtils.isEmpty(n)){
                print("参数错误")
                return
            }
        }
    }

}
