package com.example.testcalculator

class DivideOperation : AbstractOperation(){
    override fun operate (num1:Int, num2:Int):Double = (num1.toFloat() / num2.toFloat()).toDouble()
}