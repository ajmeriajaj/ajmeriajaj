public class multiDimensionalArray {

    public static void main(String[] args) {
        /*
          MultiDimensional array are ARRAY of ARRAY each element of a multiDimensional is an array itself 
        */

        int[][] flats = new int[3][4];

        flats[0][0] = 000; 
        flats[0][1] = 001; 
        flats[0][2] = 002; 
        flats[0][3] = 003; 

        flats[1][0] = 100; 
        flats[1][1] = 101;
        flats[1][2] = 102;
        flats[1][3] = 103;

        flats[2][0] = 200; 
        flats[2][1] = 201;
        flats[2][2] = 202;
        flats[2][3] = 203;

        // flats[3][0] = 300; 
        // flats[3][1] = 301;
        // flats[3][2] = 302;
        // flats[3][3] = 303;

        System.out.println(flats[0][0]);
        System.out.println(flats[0][1]);
        System.out.println(flats[0][2]);
        System.out.println(flats[0][3]);

        System.out.println(flats[1][0]);
        System.out.println(flats[1][1]);
        System.out.println(flats[1][2]);
        System.out.println(flats[1][3]);

        System.out.println(flats[2][0]);
        System.out.println(flats[2][1]);
        System.out.println(flats[2][2]);
        System.out.println(flats[2][3]);

        // System.out.println(flats[3][0]);
        // System.out.println(flats[3][1]);
        // System.out.println(flats[3][2]);
        // System.out.println(flats[3][3]);

        System.out.printf("\nDispaly 2D arrays using for loop : \n\n");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.printf("\nDispaly 2D arrays using while loop : \n\n");
        int i = 0;
        while (i < flats.length) {
            int j = 0;
            while (j < flats[i].length) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
                j++;
            }
            i++;
            System.out.println();
        }


        
        
    }
}