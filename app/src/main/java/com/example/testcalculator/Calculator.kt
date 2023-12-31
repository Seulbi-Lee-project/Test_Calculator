package com.example.testcalculator

class Calculator(var abstractOperation: AbstractOperation) {
//    private var addOperation = AddOperation()
//    private var subtractOperation = SubtractOperation()
//    private var multiplyOperation = MultiplyOperation()
//    private var divideOperation = DivideOperation()

    fun operate(num1: Int, num2: Int):Double{
        return abstractOperation.operate(num1, num2)
    }

    fun addOperation(addOperation: AddOperation, num1:Int, num2:Int):Double{
        return addOperation.operate(num1, num2)
    }

    fun subOperaton(subtractOperation: SubtractOperation,num1: Int, num2: Int):Double{
        return subtractOperation.operate(num1, num2)
    }

    fun multiplyOperation(multiplyOperation: MultiplyOperation, num1: Int, num2: Int):Double{
        return multiplyOperation.operate(num1, num2)
    }

    fun divideOperation(divideOperation: DivideOperation, num1: Int, num2: Int):Double{
        return divideOperation.operate(num1, num2)
    }

//    fun operation (num1: Int, num2:Int, operator:String){
//        when(operator) {
//            "+" -> println("${num1} ${operator} ${num2}는 ${addOperation.operation(num1, num2)}입니다.")
//            "-" -> println("${num1} ${operator} ${num2}는 ${subtractOperation.operation(num1, num2)}입니다.")
//            "*" -> println("${num1} ${operator} ${num2}는 ${multiplyOperation.operation(num1, num2)}입니다.")
//            "/" -> println("${num1} ${operator} ${num2}는 ${divideOperation.operation(num1, num2)}입니다.")
//            "%" -> println("${num1} ${operator} ${num2}의 나머지는 ${num1 % num2}입니다.")
//            else -> println("잘못된 계산식입니다.")
//        }
//    }
}