package tutorial;

public class Chapter16GenericsSerialization {
}
/*
Generic Methods/Classes:
- specify a set of related methods with a single method declaration
- specify a set of related types with a single class declaration
- provide a compile-time safety to catch invalid types at compile time

Serialization:
- object can be represented as a sequence of bytes
- serializaed object written into file = can be read from file and deserialized
- JVM independent
- utilizes ObjectInputStream(deserialize) and ObjectOutputStream(serialize) class streams to serialize and deserializ objects

**writeObject = serialize, readObject = deserialize , transient = DO NOT SERIALIZE

- class must implement java.io.Serializable
- all fields must be serializable, if not then mark as transient (to check if class is serializable, just check if the class implements java.io.serializable)

Try/Catch Block to catch ClassNotFound exception and
 */
