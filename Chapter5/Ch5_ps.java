// import java.util.Scanner;

public class Ch5_ps {
    public static void main(String[] args) {
        /*
           Q1
           Write a program to find the following pattern
           * * * * *
           * * * *
           * * *
           * *
           *
         */
        for (int i = 1; i <=5; i++) {
         for (int j = i; j <= 5; j++) {
            System.out.print("* ");
         }
         System.out.println();
        }

        /*
           Q2
           Write a program to sum first n even numbers using for loop
         */ 
        int sum = 0;
        int num = 5;

        for (int i = 0; i < num; i++) {
            sum = sum + (2*i);
        }
        System.out.println("Sum of even numbers is: " + sum);

        /*
           Q3
           Write a program to print multiplication table of the given number n
         */
        int n = 2;
       

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }

        /*
           Q4
           Write a program to print multiplication table of 10 in reverse order
         */
        System.out.println("Table of 10 in reverse order: ");
        int number = 10;

        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d x %d = %d\n", number, i, number*i);
        }

        /*
           Q5
           Write a program to find factorial of a given number using for loop
         */
        System.out.println("using for loop!");
        System.out.println("factoails of ten : ");
        int num2 = 10;
        int fact = 1;
        for (int i = 1; i <= num2; i++) {
            fact *= i;
        }
        System.out.println(fact);

        /*
           Q6
           Write a program to find factorial of a given number using while loop
         */
        // System.out.println("factorials of five : ");
        // int num1 = 5;
        // int i = 1;
        // int factorial = 1;
        // while(i<=num1) {
        //     factorial *= i;
        //     i++;
        // }
        // System.out.println(factorial);

        /*
           Q7
           Write a program to find the following pattern using while loop
           * * * * *
           * * * *
           * * *
           * *
           *
         */
        int i = 1;
        while (i <= 5) {
            int j = i;
            while (j <= 5) {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }

        /*
           Q8
           Write a program to calculate the sum of the number occuring in the multiplication table of 8
         */
        int n1 = 8;
        int sumn = 0;

        for (int j = 1; j <= 10; j++) {
            System.out.printf("%d x %d = %d\n", n1, j, n1*j);
            sumn += n1 * j;
        }
        System.out.println(sumn);

        /*
           Q9
           Write a program to sum first n even numbers using while loop
         */
        int sum2 = 0;
        int num3= 5;

        int k = 0;
        while (k < num3) {
            sum2 = sum2 + (2*k);
            k++;
        }
        System.out.println("Sum of even numbers is: " + sum2);


        

        





    }


}
