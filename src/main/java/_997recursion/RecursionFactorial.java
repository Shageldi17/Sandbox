package _997recursion;

public class RecursionFactorial {
    public static int factorial (int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int result = factorial(12);
        System.out.println("Factorial of 12 is: " + result);
    }
}

