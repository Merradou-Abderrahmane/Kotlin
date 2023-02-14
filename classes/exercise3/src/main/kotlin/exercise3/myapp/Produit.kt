package exercise3.myapp

open class Produit (name: String, price: Int) {
   open var name: String = name
    var price: Int = price
    open var test: string = "test"
    init {
        println("hello")
    }

    fun print(){

        print("product name is $name it's price is $price ")
    }
}