// step by step to a pyramid of stars and lines of it defined by the user
fun main (){
// 1. ask the user to enter a number
   println("Enter a number")
   val input: Int = readln().toInt()

// 2. print a * for each number (to change it later to a pyramid of stars)
//    for (input in 1..input){
//       println("*")
//    }

// 3. print a triangle of stars
   // for (i in 1..input){
   //    for (j in 1..i){
   //       print("*")
   //    }
   //    println()
   // }
   
// 4. print a pyramid of stars
   for (i in 1..input){
      for (j in 1..input-i){
         print(" ")
      }
      for (j in 1..i){
         print("*")
      }
      for (j in 1..i-1){
         print("*")
      }
      println()
   }


}