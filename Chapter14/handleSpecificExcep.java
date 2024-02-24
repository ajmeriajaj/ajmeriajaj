import java.util.Scanner;

public class handleSpecificExcep {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 98;
        marks[1] = 89;
        marks[2] = 78;
        // marks[3] = 87;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int index = sc.nextInt();
        System.out.println("Enter the you want to divide with : ");
        int number = sc.nextInt();
        
        try {
            System.out.println("The value at array index entered is : " + marks[index]);
            System.out.println("The value of array-value/number is : " + marks[index]/number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        } catch (Exception e){
            System.out.println("Some other exception occurred!");
        }

        sc.close();
        
    }
}
