import java.util.Scanner;

public class calculator {

    static int addtion(int a, int b) {
        int c = a + b;
        return c;
    }

    static int subtraction(int a, int b) {
        int c = a - b;
        return c; 
    }

    static int multiphication(int a, int b) {
        int c = a * b;
        return c;

    }

    static int division(int a, int b) {
        int c = a / b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of x : ");
        int x = sc.nextInt();
        System.out.println("enter value of y : ");
        int y = sc.nextInt();

        System.out.println(addtion(x, y));
        System.out.println(subtraction(x, y));
        System.out.println(multiphication(x, y));
        System.out.println(division(x, y));
        

        sc.close();
    }
}

