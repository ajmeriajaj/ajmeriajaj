public class RelationLogicalOperators {
    public static void main(String[] args) {
        /* 
           Relation Operators
           ==, >=, >, <, <=, !=

           Logical Operators 
           &&, ||, and ! are most commanly used logical operators in java 
           These are read as 
           &&  ---> And
           ||  ---> Or
           !   ---> Not
           These are used to provide logic to our java program 

           Truth Table of And 
           A   B   Result
           0   0   0
           0   1   0
           1   0   0
           1   1   1

           Truth Table of Or 
           A   B   Result
           0   0   0
           0   1   1
           1   0   1
           1   1   1

           Truth Table of Not
           A   Result
           0   1
           1   0
           
         */

         boolean a = true;
         boolean b = false;
 
        //  if (a && b) {
        //     System.out.println("Yes");
        //  } else {
        //     System.out.println("No");
        //  }
         
        //  if (a || b) {
        //     System.out.println("Yes");
        //  } else {
        //     System.out.println("No");
        //  }

        System.out.println("Not(A) is " + !a);
        System.out.println("Not(B) is " + !b);
        
    }
}
