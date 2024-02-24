import java.util.Scanner;

public class error {
    public static void main(String[] args) {
        // int i = 10;  
        // int j = 10;
        // // System.out.println(i + j);

        //logical error
        // System.out.println(2);
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(2*i+1);
        // }

        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is " + 1000/k);
        sc.close();
    }
}
