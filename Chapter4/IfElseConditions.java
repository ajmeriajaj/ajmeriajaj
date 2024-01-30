import java.util.Scanner;

public class IfElseConditions {
    public static void main(String[] args) {
        /* 
           if-else is work on the conditions, sometimes you want make decision between 2 & more choices 

           The if-else statement is used to make decisions based on conditions, allowing you to choose between two or more options.

         */
         Scanner sc = new Scanner(System.in);
         int age = sc.nextInt();
         if (age > 18) {
            System.out.println("Yes Boy yu can drive!");
         } else {
            System.out.println("No boy yu can not yet!");
         }
         sc.close();
    }
}
