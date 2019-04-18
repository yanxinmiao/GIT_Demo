package com.example.kotlin

/**
 *
 * Crated by yxm on 19-3-19
 *
 * 数据类
 * 1、必须有一个主构造函数
 * 2、参数要使用val、var修饰
 * data = java中的private + getter + setter + equals + hashCode + toString
 */
data class Book(val name: String)