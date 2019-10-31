/**
 * generic 
 */
class Box<T> (elem: T) { 
	val element: T = elem
}
fun main() {
    val box: Box<Int> = Box(55)  // type can also be inferred
    print(box.element)
}
