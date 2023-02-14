package exercise3.myapp

class Produit (name: String, price: Int) {
    var name: String = name
    var price: Int = price
    init {
        println("hello")
    }

    fun print(){
        print("product name is $name it's price is $price ")
    }
}