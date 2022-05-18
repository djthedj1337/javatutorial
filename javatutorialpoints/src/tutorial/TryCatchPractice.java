package tutorial;

public class TryCatchPractice {
    public static void main(String args[]) {
        try {
            //create array with length of 6 so 0 - 5
            int x[] = new int[6];
            System.out.println("Element 7: " + x[5]);
            //Following string will print if no exception was caught
            System.out.println("Exception was not catched");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception was caught: " + e);
        }
    }
}
