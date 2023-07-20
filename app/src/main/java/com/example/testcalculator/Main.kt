package com.example.testcalculator

fun main() {
    var cal = Calculator()

    println("숫자를 입력하세요.")
    var num1 = readLine()!!
    println("사칙연산을 선택해 주세요. [+] 더하기 [-] 빼기 [*] 곱하기 [/] 나누기 [%]나머지")
    var operator = readLine()!!
    println("숫자를 입력해 주세요.")
    var num2 = readLine()!!

    cal.operation(num1.toInt(), num2.toInt(), operator)

}

class Calculator {

    fun operation (num1: Int, num2:Int, operator:String){
        when(operator) {
            "+" -> println("${num1} ${operator} ${num2}는 ${num1 + num2}입니다.")
            "-" -> println("${num1} ${operator} ${num2}는 ${num1 - num2}입니다.")
            "*" -> println("${num1} ${operator} ${num2}는 ${num1 * num2}입니다.")
            "/" -> println("${num1} ${operator} ${num2}는 ${num1.toFloat() / num2.toFloat()}입니다.")
            "%" -> println("${num1} ${operator} ${num2}의 나머지는 ${num1 % num2}입니다.")
            else -> println("잘못된 계산식입니다.")
        }
    }
}