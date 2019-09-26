/**
 * using with()
 */

fun main() {
    val countryCapital = 
        mutableMapOf<String, String> ("Canada" to "Ottawa", "Ireland" to "Dublin"  )
    val countries = with(countryCapital) {
        putIfAbsent("Ukrane", "Kiev")
        putIfAbsent("Ecuador", "Quito")
        keys  // return value of the lambda hence with
    }
    println(countryCapital)
    println(countries)
    
    // we don't want the StringBuilder() 
    // we want the lambda result 
    // so with preferable to apply here 
    val essay = with(StringBuilder()) {
        appendln("Intro")
        appendln("Content")
        appendln("Conclusion")
        toString()
    }
    println (essay)
}
