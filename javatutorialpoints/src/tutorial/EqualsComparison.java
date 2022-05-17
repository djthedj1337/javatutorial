package tutorial;

public class EqualsComparison {
    public static void main(String[] args){
        String a = new String("hello");
        String b = "hello";

        System.out.println((a ==b)); //should be false, not the same object/location in heap
        System.out.println(a.equals(b)); //should be true, same value
    }
}
