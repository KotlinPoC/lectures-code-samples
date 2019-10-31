/**
 * data classes
 */
data class Contact(val name:String, val phone: String, var favourite: Boolean)

fun main() {
    val gh = Contact("Grace Hopper", "012-345-6789", true)
    val dv = Contact("Dorothy Vaughn", "123-456-7890", true)
    val dv2 = Contact("Dorothy Vaughn", "123-456-7890", true)
	  println(gh)   // toString()
    println(dv == dv2)    // equals() true
    println(gh == dv2)	  // equals() false
    
    val contacts = hashSetOf(gh, dv,dv2)  // hashCode()
    println(contacts.size )				  // result 2, no duplicates
    val (name, phone, _) = gh			 // componentx 
    println ("$name's nubmer is $phone")
    val kj = dv.copy(name = "Katherine Johnson")    // copy()
    println(kj)
}
