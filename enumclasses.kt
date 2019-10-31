/**
 * enum classess  
 */
// simple enum
enum class Payment { PAID, PENDING, UNPAID }
// enum with members & property
enum class PaymentStatus (val billable:Boolean) {
    // abstract methods must be overridden in each enum instance
    UNPAID(true) { override fun calculate() { 4 + 5 }  },
    PAID(false) { override fun calculate() { 6 + 10 }  };
    fun print() {println("Payment is $this.name")}  // concrete method
	abstract fun calculate() 
}
fun main() {
    val status = PaymentStatus.PAID
    status.print() 
    status.calculate()
    println(status.name)    // PAID  compiler generated
    println(status.ordinal)	// 1    compiler generated
    println(status.billable)	// false
    println(PaymentStatus.PAID > PaymentStatus.UNPAID) // true
    var values = PaymentStatus.values()   // all enum values, compiler generated
    println(values.joinToString())
    println(PaymentStatus.valueOf("UNPAID"))
	
}
