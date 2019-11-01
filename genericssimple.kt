/**
 * generic 
 */
import java.util.Arrays
class Box<T> (elem: T) { 
	val element: T = elem
}
fun <T> myListOf(vararg elements: T) =
    // * is spread operator
    Arrays.asList(*elements)
fun main() {
    val box: Box<Int> = Box(55)  // type can also be inferred
    print(box.element)
    // all explicit, no inference
    val list0: List<Int> = myListOf<Int>(1,2,3) 
    // infers myListOf<Int>
    val list1: List<Int> = myListOf(1,2,3) 
    // infers MutableList<Int> and myListOf<Int>
    val list2 = myListOf(1,2,3)
    // infers MutableList<Number>
    val list3 = myListOf<Number>(1,2,3) 
    // no parameters
    // infers MutableList<Int>
    val list4 = myListOf<Int>()
    // infers myListOf<Int>
    val list5: List<Int> = myListOf()
}
