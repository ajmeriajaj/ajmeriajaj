public class Array {
    public static void main(String[] args) {
        /* 
           Arrays is collection of simillar data types 
           arrays is 0 indexing
           arrays is an object in java
           Most of the programmimg languages 0 index array

           There are three main way used array
           1. declaration and memory allocation
           int[] marks;
           marks = new int[5];

           2. declaration and then memory allocation
           int[] marks = new int[5];
           // initialize
           marks[0] = 56;
           marks[1] = 66;
           marks[2] = 76;
           marks[3] = 86;
           marks[4] = 96;

           3. declaration, memory allocation, and initialize 
           int[] marks = {0, 1, 2, 3, 4}
        */
        
        //  String[] students = {"ajaj", "Ajaj", "rajan", "rehan", "jisan", "rushan"}; 
        //  System.out.println(students.length);
        //  System.out.println(students[3]);
        //float[] marks = {98f, 97f, 89f, 87f, 78f, 79f};

         int[] marks ={98, 97, 89, 87, 78, 79};
         
        //  System.out.println(marks.length);
        //  System.out.println(marks[0]);
        //  System.out.println(marks[1]);
        //  System.out.println(marks[2]);
        //  System.out.println(marks[3]);
        //  System.out.println(marks[4]);
        //  System.out.println(marks[5]); 

         //Display the array using for loop
         for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);      // --------> Array Traversal
         }

         System.out.println("Array Traversal in reverse order : ");
         for (int i = marks.length -1; i >= 0; i--) {
            System.out.println(marks[i]);
         }

         System.out.println("Display array using while loop");
         int i = 0;
         while (i < marks.length) {
            System.out.println(marks[i]);
            i++;
         }

         System.out.println("Dispay array using for-each loop");
         for (int j : marks) {
            System.out.println(j);
         }
         

    }
}
