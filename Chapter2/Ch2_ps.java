//import java.util.Scanner;

public class Ch2_ps {
    public static void main(String[] args) {
        /*
           Q1
           What will be the result of the following expression float a = 7/4*9/2 
        */
        //float a = 7/4 * 9/2; // This is float variable used but value is integer if I am add "F" after value then it's not integer it's actual float
        //System.out.println(a);

        /*
          Q2
          Write a java program to encrypt a grade by adding 8 to it. decrypt it to show the correct grade
        */
        // char grade = 'B';
        // grade = (char)(grade + 8);
        // System.out.println(grade);

        // Decrypt
        // grade = (char)(grade - 8);
        // System.out.println(grade);

        /* 
          Q3 
          Use comparison operators to find out whether a given number is greater than the user entered number or not                                 
        */
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number");
        // int num = sc.nextInt();
        // System.out.println(num > 8);
        // sc.close();

        /*     
          Q4
          Write the following expression in a java program (v*v - u*u) / (2*a*s) 
        */

        double v = 10;
        double u = 5;
        double a = 2;
        double s = 4;
        double res = v*v - u*u / 2*a*s;
        System.out.println(res);

        /*     
          Q5
          find the value of the following expression 
          int x = 7;
          int a = 7*49/7 + 35/7
          value of a ??
        */
        // int x = 7;
        // int a = x*(49/x) + (35/x);
        // System.out.println(a);

    }
}