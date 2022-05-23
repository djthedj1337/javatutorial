package tutorial;

//please view Person.java for examples

public class Chapter3ConstructorsAccessModifiers {
}
/*
Variables:
- Local : Defined inside methods, constructors, and/or blocks; declared and initialized at start of method and destroyed with method completion
- Instance: Defined in class, outside method, initialized when class instantiated, can be accessed inside a method, constructor, or block from that class
- Class: Defined in class with static keyword

Constructors:
- Compiler will build default constructor for you, one constructor must be invoked but can have multiple constructors

Creating Object:
- Declaration: variable name with object type
- Instantiation: new keyword
- Initialization: new keyword followed by call to constructor

Access Control Modifiers:
- Default: visible to package
- Private: visible to class only
- Public: visible to world
- Protected: visible to package and all subclasses

Non-Access Modifiers:
- Static: creation of class methods and variables
- Final: finalizing implementation of classes, methods, and variables
- Abstract: creating abstract classes and methods
- Synchronized/Volatile: used for threads

More About Static:
- Static variables are shared among all instances of the class (also reduce memory)
- Non-static variables are only available within their relevant instance (does not reduce amount)



- Static methods can't access non static methods and variables BUT can rewrite the values of any static member.
- Nonstatic methods CAN access static methods and variables and can change the values of any static member.
- In order to call non-static methods, an instance of the class must be created in order to call upon the method.
- You can call upon static methods by utilizing class.staticmethod()





 */
