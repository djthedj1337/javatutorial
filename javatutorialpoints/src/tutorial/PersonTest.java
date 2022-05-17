package tutorial;


public class PersonTest {
    public static void main(String[] args){
        Person david = new Person("David", 25);

        Person george = new Person();

        david.getInfo();
        george.setInfo("George", 61);
        george.getInfo();

        StringBuilder sb = new StringBuilder("hello");
    }
}
