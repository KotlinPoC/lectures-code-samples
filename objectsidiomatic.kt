/**
 * classes & object instantiation
 * properties 
 */

// idiomatic simple property
// val or var implicitly make it a class property, automagically handles init with arg
// declaring val makes an immutable property
// var makes a mutable property
class Task2 (var title: String)

// using a primary constructor 
class Task1 (title: String) {  
    val title: String = title  
}
// properties the hard/java way
class Task {
    val title: String
    constructor (title: String ) {
        this.title = title
    }
}
fun main() {
    val pet = Task("brush piranha")
    println(pet.title)   
    val pet1 = Task1("fluff the cat")
    println(pet1.title)   
    val pet2 = Task2("pet the dog")
    println(pet2.title)    // calls getter
    pet2.title = "pet and hug the dog"    // calls setter
    println(pet2.title)
}
