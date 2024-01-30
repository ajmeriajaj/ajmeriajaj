// import java.util.Scanner;

public class Ch6_ps {
    public static void main(String[] args) {
        /* 
           Q1
           Create an array of 5 floats and calculate their sum 
        
        float sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of arrays");
        float[] arr = new float[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextFloat();
        }
        System.out.println("Arrays : ");
        for (float f : arr) {
            System.out.println(f);
            sum = sum + f;
        }

        System.out.println("Sum of arrays : " + sum);
        sc.close();
        */

        /* 
           Q2
           Write a program to find out whether a given integer is present in an array or not 
        
        int[] Arr = {10, 4, 5, 9, 7, 5, 11, 45, 78, 89, 98};
        int search = 6;
        boolean found = false;

        for (int i : Arr) {
            if (search == i) {
                found = true; 
                break;
            }
        }
        if (found) {
            System.out.println("The Value is present in array" );
        } else {
            System.out.println("The Value is NOT present in array");
        }
        */

        /* 
           Q3
           calculate the average marks from array containing marks of all students in phyiscs using foreach marks
        */
        int sum = 0;
        int[] marks = {77, 78, 79, 87, 88, 89, 97, 98, 99};

        for (int i : marks) {
            System.out.println(i);
            sum = sum + i;
        } 
        System.out.println("avarage of marks : " + sum/marks.length);
        
        /* 
           Q4
           Write a java program to add two matrix of size 2 x 3
        */
        int[][] mat1 = {{11, 22, 33},
                        {44, 50, 60}};

        int[][] mat2 = {{23, 24, 32},
                        {48, 50, 60}};

        int[][] mat3 = {{0, 0, 0},
                        {0, 0, 0}};

                        
            System.out.println("\nDispaly the value of i and j for mat2 : ");
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    System.out.printf("Adding two array i = %d and j = %d = %d \n", i, j, mat1[i][j]);
                    mat3[i][j] = mat1[i][j] + mat2[i][j]; 
                }
            }

            System.out.println("\nDispaly the value of i and j for mat2 : ");
            for (int i = 0; i < mat2.length; i++) {
                for (int j = 0; j < mat2[i].length; j++) {
                    System.out.printf("Adding two array i = %d and j = %d = %d \n", i, j, mat2[i][j]);
                    mat3[i][j] = mat1[i][j] + mat2[i][j]; 
                }
            }

            System.out.println("\nResult of 2D array : ");
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    System.out.print(mat3[i][j] + " ");
                    mat3[i][j] = mat1[i][j] + mat2[i][j]; 
                }
                System.out.println();
            }

        /* 
           Q5
           Write a java program to reverse an array
        */
        byte[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Display array in reverse : ");
        for (int i = arr.length -1; i >= 0; i--) {
            System.out.println(arr[i]);
        }


        //revrese an array in others way: 

        int[] Arr = {18, 2, 3, 4, 5, 6, 99, 56, 78, 36};
        int l = Arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            temp = Arr[i];
            Arr[i] = Arr[l - i - 1];
            Arr[l - i - 1] = temp;
        }

        System.out.println("Reverse array using swap method : ");
        for (int i : Arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        /* 
           Q6
           Write a java program to find the maximum element in an array
        */
        int[] ARR = {18, 2, 3, 4, 5, 6, 99, 56, 78, 36};
        int max = Integer.MIN_VALUE;

        for (int i : ARR) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("The value of the maximum element in this array is : " + max);
        
        /* 
           Q7
           Write a java program to find the manimum element in an array
        */
        int[] ARR1 = {18, 2, 3, 4, 5, 6, 99, 56, 78, 36};
        int min = Integer.MAX_VALUE;

        for (int i : ARR1) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("The value of the manimum element in this array is : " + min);

        /* 
           Q8
           Write a java program to find whether an array is sorted or not
        */

        boolean isSorted = true;
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }



    }
}
