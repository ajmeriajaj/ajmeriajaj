import java.util.Scanner;

public class nestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 78;
        marks[1] = 87;
        marks[2] = 79;
        marks[3] = 97;
        marks[4] = 89;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the array index : ");
            int index = sc.nextInt();

            // System.out.println("Enter the you want to divide with array index : ");
            // int number = sc.nextInt();

            try {
                System.out.println("Welcome to the code!");
                try {
                    System.out.println(marks[index]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist!");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("EXception in level 1");
            }
        }
        System.out.println("Thanks for using this code!");
        sc.close();
    }
}
