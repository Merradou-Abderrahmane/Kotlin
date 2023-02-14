## Basics
Kotlin is very similar to other languages when it comes to the basics like operators, lists, and loops, but there are some important differences.

The following features may be different in Kotlin than what you're used to in other languages:

Kotlin types can't be implicitly converted—use casting.
Variables declared with val can only be assigned once.
Kotlin variables are not nullable by default. Use ? to make variables nullable.
With Kotlin, you can loop through the index and elements of an array at the same time in a for loop.
The following Kotlin programming constructs are similar to those in other languages:

Arrays and lists can have a single type or mixed types.
Arrays and lists can be nested.
You can create loops with for, while, do/while, and repeat.
The when statement is Kotlin's version of the switch statement, but when is more flexible.

## Functions


## Classes and objects
- Under the hood, Kotlin automatically creates getters and setters for the properties you defined in the Aquarium class,but you can also define your own getters and setters.

- Kotlin classes can have primary and secondary constructors. The primary constructor is part of the class header. Secondary constructors are defined inside the class body.

- In Kotlin, classes, objects, interfaces, constructors, functions, properties, and their setters can have visibility modifiers:
   - public means visible outside the class. Everything is public by default, including variables and methods of the class.
   - internal means it will only be visible within that module. A module is a set of Kotlin files compiled together, for example, a library or application.
   - private means it will only be visible in that class (or source file if you are working with functions).
   - protected is the same as private, but it will also be visible to any subclasses.

