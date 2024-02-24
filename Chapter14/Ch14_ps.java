import java.util.Scanner;

class maxRetriesException extends Exception {
    @Override
    public String toString() {
        return super.toString() + "No more retries";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "No more retries";
    }
}

public class Ch14_ps {
    public static void main(String[] args) throws maxRetriesException {
        /*
           Q1
           Write a java program to demonstrate Syntax, logical, & Runtime error.
          */
        //  Syntax Error : -----> int a = 9
        //  int b = 15; 
        //  Logical Error
        //  int age = 78;
        //  int yearBorn = 2000 - 78; 
        // Runtime Error : -----> System.out.println(5/0);

        /*
           Q2
           Write a java program that print "HaHa" during Arithmetic Exception and "HeHe"
           during an Inlegal argument Exception
          / 
        t y {
           // int a = 999/0;
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }

        /*
           Q3
           Write a java program that allows you to keep accessing an array until a valid
           index is given id max retries exceed 5 print "Error"
           
           Q4
           Modify program in Q3 tp throw a custom Exception if more retries are reached

           Q5
           Wrap the program in Q3 inside a method which throws your custom Exception
         */

        boolean flag = true;
        int[] arr = new int[3];
        arr[0] = 15;
        arr[1] = 16;
        arr[2] = 17;
        
        Scanner sc = new Scanner(System.in);
        int index;

        int i = 0;
        while (flag && i<5) {
            try {
                System.out.println("Enter the array index : ");
                index = sc.nextInt();
                System.out.println("The value of arr[index] is : " + arr[index]);
                break;

            } catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }
        } 

        try {
            if (i>=5) {
            System.out.println("Error"); 
            throw new maxRetriesException();
        }
        } catch (Exception e) {
            System.out.println("No more Retries because  it's overflow");
        } finally {
            sc.close();
        }

        
    }
}
