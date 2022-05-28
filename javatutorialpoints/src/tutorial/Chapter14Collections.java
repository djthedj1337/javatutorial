package tutorial;

public class Chapter14Collections {
}
/*
Collections Framework:
- high performance, implementations were to be highly efficient
- allow different collections to work similiarly and with interopearbility
- extend/adapt collection easily
** contains interfaces, implementations, algorithms
'

Collections Interfaces:
- List: can insert/access position in list, duplicate elements allowed
- Set: stronger contract on equals, no duplicate elements
- SortedSet: extends Set, ascending order, otherwise the same
- Map: key and value pairs, .entrySet() allows Map interface to return a Set containing map entries
- SortedMap: extends Map, ascending order


LinkedList:
- extends AbstractSequentialList + implements List interface
- data stored as separate object with data part and address part
- utilize pointers and addresses, each element is known as a "node"
- easy to insert and delete, more dynamic
- node cannot be access directly though as need to go through head and follow link
- peek(),peekFirst(),peekLast(),poll(), etc.
- changes reference points in order to traverse list


ArrayList:
- extends AbstractSequentialList + implements List interface, linear data structure
- dynamic array as well
- created with initial size but is automatically enlarged when size is exceeded
- slower than standard arrays but beneficial with mass manipulation
- everything needs to be shifted in order to insert

ArrayList v. LinkedList:
- Speed: LinkedList > ArrayList
- Manipulation: LinkedList > ArrayList
- Storage and Access: ArrayList > LinkedList
- ArrayList - Shifts memory bits, LinkedList - changes reference points'
**implements using doublyLinked which has the previous pointer + next pointer + data

HashSet:
- extends AbstractSet and implements Set interface
- creates and stores using a hash table
- hashing transforms key into hash code
- unordered collection, faster than TreeSet due to unorder
- allows one null value

LinkedHashSet:
- maintains linked list of entries by insertion order
- return in which they were inserts (FIFO)
- hash code used as index which data is stored
- inserts and removes better than TreeSet but still performs less than TreeSet

TreeSet:
- utilizes tree for storage, sorted into ascended order
- access and retrieval quite fast, great for storing large amounts of SORTED information

TreeMap:
- implements Map using tree as storage
- sorted order for sorted info for sorted rapid retrieval
- GUARANTEES it will be sorted in ascending order (unlike Hash map)

HashMap:
- Non-synchronized, allows one null key and multiple null values
-

Concurrent HashMap:
- implements concurrent map interface and serializable interface, extends AbstractMap
- thread safe, divided into a number of segmenets
- better than hashmap performance wise in dealing with threads
- null object is not possible
**thread locks particular segment in which thread wants to work in, "segment locking" and"bucket locking"

Properties HashMap
- key-value pairs are String, subclass of HashTable
 */
