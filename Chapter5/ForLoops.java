import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("ascending order");
        for (int i = 1; i <=num; i++) {
            System.out.println(i);
        }
        
        System.out.println("odd number");
        for (int i = 0; i < num; i++) {
            System.out.println(2*i+1);
        }

        System.out.println("even number");
        for (int i = 0; i < num; i++) {
            System.out.println(2*i);
        }

        System.out.println("reverse order");
        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }
        
        sc.close();
    }
}
 