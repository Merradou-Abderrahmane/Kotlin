package exercise3.myapp

class ProductManagement: IProductManagement {
    private val products = mutableListOf<Product>()

    override fun deleteProduct(name: String) {
        products.removeIf { it.name == name }
    }

    override fun addProduct(product: Product) {
        products.add(product)
    }

    override fun displayProducts() {
        if (products.isEmpty()) {
            println("No products to display.")
        } else {
            println("Product list:")
            for (product in products) {
                println("- ${product.name}: $${product.price}")
            }
        }
    }


}