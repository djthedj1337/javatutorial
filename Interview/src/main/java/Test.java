public class Test {
    /*
    a(int n);

    n == 0
    reutnr 1

    n == 1
    returns 1

    a(n) = a(n-1) + a(n-2)
    a(n-1) = fSumn
    a(n-2) = fSum
    a(n) = resSum

     */

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-zero and non-null values");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        int fSum = 1;
        int sSum = 1;
        int resSum = 0;
        for (int i = n; i > 1; i--) {
            resSum = fSum + sSum;
            sSum = fSum;
            fSum = resSum;
        }
        return resSum;
    }
    public static int recFibo(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-zero and non-null values");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return recFibo(n-1) + recFibo(n-2);
    }



    public static void main(String[] args){
        int test = 100;
        System.out.println(recFibo(test));
    }
}
