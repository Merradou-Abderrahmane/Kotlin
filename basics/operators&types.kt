// 1 => Explore numeric operators , run in PERL 
1+1
⇒ res8: kotlin.Int = 2

// Double is a floating point number
1.0/2.0
⇒ res11: kotlin.Double = 0.5

// Kotlin keeps numbers as primitives, 
// but it lets you call methods on numbers as if they were objects

2.times(3)
⇒ res5: kotlin.Int = 6

3.5.plus(4)
⇒ res8: kotlin.Double = 7.5

2.4.div(2)
⇒ res9: kotlin.Double = 1.2

// Note: It is possible to create actual object wrappers around numbers,
//  which is known as boxing. Boxing happens automatically, such as for collections, 
//  where numbers are boxed and unboxed as needed.

// Warning: Using object wrappers takes more memory than storing just a number primitive. 
// Do not use boxing unless it is needed, such as in a collection, which is covered later.

// 2 => Practice using types

// Kotlin does not implicitly convert between number types, 
// so you can't assign a short value directly to a long variable, or a Byte to an Int. 
// This is because implicit number conversion is a common source of errors in programs.
// You can always assign values of different types by casting

// casting example 
val a: Int = 10000
val b: Byte = a.toByte()






