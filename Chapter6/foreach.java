import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int[] number = new int[5];

        // number[0] = 12;
        // number[1] = 13;
        // number[2] = 14;
        // number[3] = 15;
        // number[4] = 16;


        

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        } 

        System.out.println("Dispaly array using foreach loop : ");
        for (int i : number) {
            System.out.println(i);
        }

        sc.close();
    }
}
