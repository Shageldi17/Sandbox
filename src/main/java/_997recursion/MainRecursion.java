package _997recursion;

public class  MainRecursion {


    public static void main(String[] args) {
        int answer = fib(100);
         System.out.println(answer);



    }

    // fibonacci
    //   n          0     1    2   3   4   5   6   7   8
    //   fib(n)     1     1    2   3   5   8   13  21  34   ...

    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}

// factorial recursion
