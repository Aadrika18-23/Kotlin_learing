class Spendlimits(
    val app_name: String,
    val amount_set: Double,
    var amount_spend: Double
) {
    fun spendlimit() {
        if(amount_spend >= amount_set) {
            println("You have reached upto limits $app_name is BLOCKED!")
        } else {
            println("You haven't reach up to limit")
        }
    }
    
    fun remaining(): Double {
        return amount_set - amount_spend
    }
}

fun main() {
    val obj1 = mutableListOf(
        Spendlimits("Nykaa", 5000.0, 500.0),
        Spendlimits("Myntra", 6000.0, 7000.0),
        Spendlimits("Amazon", 10000.0, 110.0)
    )
    
    for(app in obj1) {
        app.spendlimit()
    }
}