import java.util.Scanner;

public class IfElseLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 56) {
            System.out.println("You are experienced!");
        } else if (age > 46) {
            System.out.println("Yu are semi-experienced!");
        } else if (age > 36) {
            System.out.println("Yu are mid-semi Experienced!");
        } else {
            System.out.println("Yu are not Experienced!");
        }
        sc.close();
    }
}
