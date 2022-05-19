package tutorial;

public class Chapter12InterfacesPackageClassPath {
}
/*
Interfaces:
- reference type, collection of abstract methods
- contains behaviors that a class implements
- all methods of interface must be defined
- use "interface" keyword
-

Differences of Interface v. Class:
- cannot be instantiated
- no constructors, all abstract methods
- no instance fields, has to be either static or final
- implemented not extended, can extend multiple interfaces
- everything in interface is implicitly abstract, no need for "abstract" keyword

Interfaces v. Interfaces:
- interfaces can extend other interfaces
- interfaces can extend Multpiple interfaces (Java usually cannot do multiple inheritance, but interfaces are an exception)


Tagging Interfaces:
- parents interface with no methods
- creates common parents
- adds data type to a class , polymorphism

Packages:
- grouping of related types, access protection and namespace management


Class Path:
- full path to the classes directory is called the class path
- set with "CLASSPATH" system variable
- compiler and jvm construct path by adding package name to class path

Setting Class Path:
- Unix: %echo $CLASSPATH, %unset CLASSPATH; export CLASSPATH, %CLASSPATH = /path/; export CLASSPATH

-
 */
