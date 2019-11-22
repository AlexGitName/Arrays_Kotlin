package calc.array

import kotlin.random.Random
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

class ArrayCalc

//Initiate array
val floatArray: FloatArray = FloatArray(4)
val number: Array<Int> = arrayOf(1,2,3,4)
val n = number[1]
val num = Array(3,{5})
var sum: Float = 0.0f
val tabl:Array<Array<Int>> = Array(3, {Array(3,{13})})

//Function
fun floatArra() {
    for (i in 0..floatArray.size - 1) {
        floatArray[i] = Random.nextInt(0, 100).toFloat()
        println(floatArray[i])
        sum += floatArray[i]
        println("Value of array $sum")
    }
    println("$floatArray.max()")
    for(row in tabl){
        for(cell in row){
            println("$cell \t")
        }
        println()
    }
}




