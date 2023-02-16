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
- Member variables :
Properties within a class, or member variables, are public by default. If you define them with var, they are mutable, that is, readable and writable. If you define them with val, they are read-only after initialization.
If you want a property that your code can read or write, but outside code can only read, you can leave the property and its getter as public and declare the setter private, as shown below.
- Inheritance and subclasses :
In Kotlin, by default, classes cannot be subclassed. Similarly, properties and member variables cannot be overridden by subclasses (though they can be accessed).
You must mark a class as open to allow it to be subclassed. Similarly, you must mark properties and member variables as open, in order to override them in the subclass. The open keyword is required, to prevent accidentally leaking implementation details as part of the class's interface.
Note: Subclasses must declare their constructor parameters explicitly.
- Data classes :
Note: You could have used == to check whether d1 == d2 and d3 == d2. In Kotlin, using == on data class objects is the same as using equals() (structural equality). If you need to check whether two variables refer to the same object (referential equality), use the === operator.

- Singletons - Enums and sealed classes :
    - Singletons :
         object GoldColor : FishColor {
            override val color = "gold"
         }
         Because every instance of GoldColor does the same thing, it is declared as an object instead of as a class to make it a singleton. There can be only one instance of it.
    - Enums : 
         enum class Color(val rgb: Int) {
               RED(0xFF0000),
               GREEN(0x00FF00),
               BLUE(0x0000FF)
         }
         The enum class Color has three instances: RED, GREEN, and BLUE. Each instance has a property called rgb that is initialized with a value.
         Enums are a bit like singletons—there can be only one, and only one of each value in the enumeration. For example, there can only be one Color.RED, one Color.GREEN, and one Color.BLUE
   - Sealed classes :
         A sealed class is a class that can be subclassed, but only inside the file in which it's declared. If you try to subclass the class in a different file, you get an error.
         Because the classes and subclasses are in the same file, Kotlin will know all the subclasses statically. That is, at compile time, the compiler sees all the classes and subclasses and knows that this is all of them, so the compiler can do extra checks for you.
         RK : sealed classes are great for returning success or error from a network API.

- Summery to Object oriented programming in kotlin : 
Classes and constructors
Define a class in Kotlin using class.
Kotlin automatically creates setters and getters for properties.
Define the primary constructor directly in the class definition. For example: class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40)
If a primary constructor needs additional code, write it in one or more init blocks.
A class can define one or more secondary constructors using constructor, but Kotlin style is to use a factory function instead.
Visibility modifiers and subclasses
All classes and functions in Kotlin are public by default, but you can use modifiers to change the visibility to internal, private, or protected.
To make a subclass, the parent class must be marked open.
To override methods and properties in a subclass, the methods and properties must be marked open in the parent class.
A sealed class can be subclassed only in the same file where it is defined. Make a sealed class by prefixing the declaration with sealed.
Data classes, singletons, and enums
Make a data class by prefixing the declaration with data.
Destructuring is a shorthand for assigning the properties of a data object to separate variables.
Make a singleton class by using object instead of class.
Define an enum using enum class.
Abstract classes, interfaces, and delegation
Abstract classes and interfaces are two ways to share common behavior between classes.
An abstract class defines properties and behavior, but leaves the implementation to subclasses.
An interface defines behavior, and may provide default implementations for some or all of the behavior.
When you use interfaces to compose a class, the class's functionality is extended by way of the class instances that it contains.
Interface delegation uses composition, but also delegates the implementation to the interface classes.
Composition is a powerful way to add functionality to a class using interface delegation. In general composition is preferred, but inheritance from an abstract class is a better fit for some problems.


