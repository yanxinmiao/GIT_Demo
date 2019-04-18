package com.example.kotlin

/**
 *
 * Crated by yxm on 19-4-2
 */
class Lambda {



}
fun main(arg: Array<String>){
    val test = { print("无参数")}

    test.invoke()


    val sum = {a: Int , b: Int -> a + b}

    val result = sum(2 , 3)
    print("result: $result")


}


