package tutorial;

public class Chapter13DataStructures {
}
/*
Enumerations/Enums:
- technically not a data structure, more of an interface
- defines methods whihc you can enumerate
- hasMore(), nextElement()

BitSet:
- array that holds bit values, increase in size as needed

Vector:
- dynamic array similar to Array List

**Synchronized, many legacy methods not a part of collections framework
- generally constructor "Vector(int size, int incr)" as increment specifc number of elements to allocate everytime vector is increased
        - i,e, , Vector(3,2) , once >3 elements are added, the capacity becomes 5 even though the size is less than the capacity

Stack:
- subclass of vector
- implements LIFO(Last in first out)
- "vertical stack"
- peek() to look, pop() to look and remove, push() to add,

Dictionary:
- abstract that defines a data structure for mappign keys to valiues
- somewhat obsolete, utilize Maps now

HashTable:
- class provides means of organizing data based on user-defined key structure
- implements Dictionary and Map
- each key/value pair has an associated hash code (key is hashed and value stored within table)
**synchronized

Properties:
- subclass of Hashtable
- maintain lists of values, key and value are both Strings
 .getValue() is replaced by getProperty();
 */