//import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /* 
           Switch case is used when we have to make a choice between number of alternatives for a given variable
           var can be an integer, character or stringin java
           A switch can occur within another but in practice this is rarely done 
         */

         //Inhance Switch case
        char var = 'a';

         switch (var) {
            case 'a' -> System.out.println("ajaj");
            case 'b' -> System.out.println("bajaj");
            default -> System.out.println("0123456789");   
         }
/* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();  // In the java, we used int but we are also used char string in switch case()
        switch (age) {
            case 18:
                System.out.println("You are gonna become an adult!");
                break;

            case 20:
                System.out.println("Finally you say bye bye to your teen age!");
                break;

            case 22:
                System.out.println("You are become to join a job!");
                break;

            case 60:
                System.out.println("You are going to get retried!");
                break;

            default:
                System.out.println("Enjoy your life!");
                break;
                
        }
        sc.close();    */
    }
}
