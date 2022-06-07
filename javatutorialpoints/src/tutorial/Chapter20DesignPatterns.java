package tutorial;

public class Chapter20DesignPatterns {
}
/*
Design Patterns:
- each has certain specifications or rules to follow
- independent strategies to solve common OOD problems, represents an idea not an implementation
- allow code to become flexible, reusable, maintainable
- reusable in multiple projects, system architecture, application design,
- don't guarantee an absolute solution to a problem



CREATIONAL
Factory:
- aka Virtual Constructor
- define interface/abstract class for creating class but let subclasses decide which lass to instantiate
- promotes loose-coupling by eliminating need to bind application-specific classes
- code interacts SOLELY with interface or abstract classes
- Advantages: allows for scalability, abstraction, encapsulation

Singleton:
- create class with only single instance/object created
- accessed directly without need to instantiate the object of class
- Three Major Ways to Initialize Singleton
    - Eager: simplest method, class created when loaded into memory by JVM, assign reference directly, always create one instance and only one
        - simple to implement, possible resource wastage, possible CPU time, exception handling not possible
    - Lazy initialization with Double Check Locking: created only when needed, getInstance() is required, null check
        - potential less resource wastage, thread safe, overhead is reduced, can affect performance
    - Bill Pugh: inner static class to initialize, inner class is NOT loaded and only loaded when getInstance is called
        - doesn't use synchronization,most widely used approach due to simplicity and non-synchronized

Builder:
- Method chaining is used to invoke multiple methods on the same object, utilize methods that return this reference as a class instance
- builder ensures thread safety and atomicity(no way for another thread to access a method that a thread is concurrently using)


Expert:

Delegate:
 */
