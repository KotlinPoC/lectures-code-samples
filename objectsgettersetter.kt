/**
 * classes & object instantiation
 * override default getter & setters  
 */

class Task (title: String, priority: Int) {  
    val title: String = title  
    	get() = field.toUpperCase()
    var priority: Int = priority
        get() = field    // default implementation
    	set(value) {
            if (value in 0..100) field = value
            	else throw IllegalArgumentException("blah") 
        }
}
fun main() {
    val pet = Task("brush piranha's teeth", 5)
    println(pet.title)   		// calls getter
	println(pet.priority)		// calls getter
    pet.priority = -30			// calls getter, throws's IllegalArgumentException
  	println(pet.priority)		

}
