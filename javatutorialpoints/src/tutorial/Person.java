package tutorial;
//Chapter 3 Example, PersonTest = Driver class

public class Person {
    //private to maintain encapsulation
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age){
        //Example of constructor with relevant class variables
        this.name = name;
        this.age = age;
        // this.name and this.age allows the class instances to have their own distinct name and age
    }

    public void setInfo(String x, int y){
        this.name = x;
        this.age = y;
        System.out.println("Change completed!");
    }

    public void getInfo(){
        System.out.println("This person's name is " + name + " and his age is " + age + ".");
    }
}
