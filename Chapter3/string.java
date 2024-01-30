import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        /*
         * String is sequence of character
         * String is class in java
         * in the java String have special support, which is we using as a object and as
         * a data type
         */
        // Created object
        String name = new String("Ajaj");
        System.out.println(name);

        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        System.out.println(name1);
        sc.close();

        /*
         * if we are used printf when we are also used this
         * System.out.printf(""); and System.out.format(""); both are same
         * %d ---> for int
         * %f ---> for float and double
         * %c ---> for char
         * %s ---> for string
         * 
         */
        int a = 4;
        float b = 4.015f;
        double d = 45;
        System.out.printf("the value of d is %f\n", d);
        System.out.printf("The value of a is %d and The value of b is %f ", a, b);
    }
}
