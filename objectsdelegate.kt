/**
 * objects, delegated properties
 */
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
class MyDelegate: ReadWriteProperty<Cat, String> {
    var name: String  = "Felix" 
    // delegate must have getValue
    override operator fun getValue(thisRef: Cat, prop: KProperty<*>): String {
        println("$thisRef requested ${prop.name} from MyDelegate")
        return name
    }
    override operator fun setValue(thisRef: Cat, prop: KProperty<*>, value: String) {
        println("$thisRef requested ${prop.name} to $value via MyDelegate")
        if (value.isNotBlank()) {this.name = value }
    }
}
   
class Cat {
  // delegates to obj of clas MyDelegate
  var name: String by MyDelegate()
}

fun main() {
    val felix = Cat()
	println(felix.name)
    felix.name ="Xilef"
    println(felix.name)
}
