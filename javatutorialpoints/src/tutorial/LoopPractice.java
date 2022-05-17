package tutorial;

public class LoopPractice {
    public static void main(String[] args){
        for(int i = 0;i<10; i++){
            System.out.println(i);
        }

        String s = new String("Hello");
        String t = new String("a");
        while(s.length()<10){
            s = s.concat(t);
            System.out.println(s);
        }

    }
}
