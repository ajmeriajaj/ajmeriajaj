import java.util.Scanner;

public class Ch7_ps {

    static int table(int n){
            for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, i*n);
        }
            return n;
    }

    static int pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return n;
    }

    static int sumOfNaturalNum(int n){
        if (n==1) {
            return 1;
        }
        return n + sumOfNaturalNum(n - 1);
    }

    static int patterns(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return n;
    }

    static int fibSeries(int n){
        // if (n==1) {
        //     return 0;
        // } else if (n==2) {
        //     return 1;
        if (n==1 || n==2) {   // this is shortcut 
            return n - 1;
        } else {
            return fibSeries(n - 1) + fibSeries(n - 2);
        }
    }

    static int avg(int ...arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (sum/arr.length);
        
    }

    static void patternsRecursive(int n){
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            patternsRecursive(n - 1);
        }
    }

    static void patternRecursive(int n){
        if (n > 0) {
            patternRecursive(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static double checkTemprature(double celsius){
        return (celsius * 9/5) + 32;

    }

    static int sumOfNaturalNumUsingIterative(int n){
        int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        return sum;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        /* 
           Q1
           Write a java method print multiplication of table of a number n 
         */
        table(num);

        /* 
           Q2
           Write a program to using function to print the following pattern
           *
           * *
           * * *
           * * * *
           * * * * *
         */
        System.out.println("\nPattern : ");
        pattern(num);

        /* 
           Q3
           Write a recursive function to calculate sum of firstn natural numbers 
         */
        int sumUsingRecursion = sumOfNaturalNum(num);
        System.out.println("\nFirst natural number of sum is : " + sumUsingRecursion);

        /* 
           Q4
           Write a program to using function to print the following pattern
           * * * * *
           * * * *
           * * *
           * *
           *
         */
        System.out.println("\nPatterns in reverse order : ");
        patterns(num);

        /* 
           Q5
           Write a function to print nth term of fibonacci searies using recursion 
         */
        int res = fibSeries(num);
        System.out.println("\nFibonacci series start from nth term : " + res);

        /* 
           Q6
           Write a function to find average of a set of numbers passed as arguments
         */
        System.out.println("\navg of a set of numbers passed as arguments : " + avg(1,2,3));

        /* 
           Q7
           Write a program to using function to print the following pattern using recursive
           * * * * *
           * * * *
           * * *
           * *
           *
         */
        System.out.println("\nPatterns in reverse order using recursive : ");
        patternsRecursive(num);
        
        /* 
           Q8
           Write a program to using function to print the following pattern using recursive
           *
           * *
           * * *
           * * * *
           * * * * *
         */
        System.out.println("\nPattern using recursive : ");
        patternRecursive(num);

        /* 
           Q9
           Write a function to convert celsius temprature into fahernheit
         */
        double celsius = 5;
        double fahernheit = checkTemprature(celsius);
        System.out.println("\n5 celsius equal to how many fahernheit : " + fahernheit);

        /* 
           Q10
           Write a function to calculate sum of firstn natural numbers using iterative approach 
         */
        int sumNaturalNum = sumOfNaturalNumUsingIterative(num);
        System.out.println("\nFirst natural number of sum using itrative approach : " + sumNaturalNum);
        

        sc.close();
    }
}
