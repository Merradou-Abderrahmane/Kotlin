package exercise3.myapp

fun main() {
    val productManagement = ProductManagement()

    while (true) {
        println("\n--- PRODUCT MANAGEMENT MENU ---")
        println("1. Add a product")
        println("2. Delete a product")
        println("3. Display products")
        println("4. Exit program")
        print("Enter your choice: ")

        when (readLine()) {
            "1" -> {
                print("\nEnter product name: ")
                val name = readLine()?.trim() ?: ""
                print("Enter product price: ")
                val price = readLine()?.toDoubleOrNull() ?: 0.0

                val product = object : Product(name, price) {}
                productManagement.addProduct(product)

                println("\nProduct added successfully!")
            }
            "2" -> {
                println("\n--- PRODUCTS ---")
                productManagement.displayProducts()
                
                print("\nEnter product name to delete: ")
                val name = readLine()?.trim() ?: ""

                productManagement.deleteProduct(name)
            }
            "3" -> {
                println("\n--- PRODUCTS ---")
                productManagement.displayProducts()
            }
            "4" -> {
                println("\nExiting program. Goodbye!")
                return
            }
            else -> {
                println("\nInvalid choice. Please try again.")
            }
        }
    }
}
