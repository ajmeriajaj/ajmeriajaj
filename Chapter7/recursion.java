import java.util.Scanner;

public class recursion {

    static int factorial(int n){
       if(n==0 || n==1) {
        return 1;
       } else {
        return n * factorial(n - 1);
       }
    }
     
    static int factorial_iterative(int n){
       if(n==0 || n==1) {
        return 1;
       } else {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
       }
    }

    static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

    static int fibonacci_iterative(int n){
        if (n <= 1) {
            return n;
        } else {
            int x = 0, y = 1;
            for (int i = 2; i <= n; i++) {
                int temp = x + y;
                x = y;
                y = temp;
            }
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a = sc.nextInt();
        System.out.println("The factorial of a is : " + factorial(a));
        System.out.println("The factorial_iterative of a is : " + factorial_iterative(a));

        System.out.println("Fibonacci searies : " + fibonacci(a));
        System.out.println("Fibonacci_iterative searies : " + fibonacci_iterative(a));

        for (int i = 0; i <= a; i++) {
            System.out.print(fibonacci_iterative(i) + ", ");
        }
        sc.close();
    }
}
