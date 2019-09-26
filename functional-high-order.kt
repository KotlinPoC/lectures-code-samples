/**
 * functional programming, high order functions
 */
// high order func applies f() twice
fun twice(f: (Int) -> Int) : (Int) -> Int = { x -> f(f(x)) }
// lambda
val square : (Int) -> Int = { value -> value * value }
// lambda
val add : (Int, Int) -> Int = { a, b -> a + b }
/*
fun returnAdd(): ((Int, Int) -> Int) {
   // can do something and return function as well
   return ::add
} */


fun printMany(iterations: Int, test: (String) -> Boolean){
    (0 until iterations).forEach {
        println("$it: ${test("myTestString")}")
    }
}
// lambda
val filter : (Int) -> Boolean = { it < 2 }
// lambda, equivalent to filter, inferred type 
val filter2 = { x : Int -> x < 2 }
// anonymous function, no name
val filter3 = fun(x : Int) : Boolean = x < 2

fun func(num: Int): (Int) -> Int = {num2 -> num2 + num}
fun main() {
 	val sum_it_from_10 = func(10)
    val sum_it_from_100 = func(100)
    println("10 + 20: ${sum_it_from_10(20)}")
    println("100 + 50: ${sum_it_from_100(50)}")

    printMany(2, { it.length > 2 })

    val squared = square(3)
    println (squared)
    val sum = add(3, 5)
    println (sum)
    //val addAgain = returnAdd()
    //val sumtoo = addAgain(6,11)
    // println (sumtoo)
    val total = twice( { it * 2 })
  	println (total(2))
    val total2 = twice { it + 2  }
  	println (total2(5))
    
}
