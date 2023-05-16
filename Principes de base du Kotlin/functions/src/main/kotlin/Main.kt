val products = mutableListOf<String>()
fun addProduct() {
    print("Enter a product: ")
    val product = readln()!!.toString()
    products.add(product)
}

fun showProducts() {
    println("Products:")
    for (product in products) {
        println(product)
    }
}

fun removeProduct() {
    print("Enter a product: ")
    val product = readln()!!.toString()
    products.remove(product)
    // show the products after removing one
    showProducts()
}

fun main() {
    var option = 0
    do {
        println("1. Add product")
        println("2. Remove product")
        println("3. Show products")
        println("4. Exit")
        print("Enter an option: ")
        option = readln()!!.toInt()
        when (option) {
            1 -> addProduct()
            2 -> removeProduct()
            3 -> showProducts()
        }
    } while (option != 4)
}