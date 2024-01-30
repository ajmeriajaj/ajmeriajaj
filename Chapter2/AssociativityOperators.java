public class AssociativityOperators {
    public static void main(String[] args) {
         /*
         */
         //Precedence & associativity 
        int a = 6*5-34/2;
        /*
           Highest Precedence goes to * and / 
           They are then evaluated on the basis of Left to Right Associativity
           =30-34/2
           =30-17
           =13
         */
        int b = 60/5-34*2;
        /*
           In this case first cheack Precedence, for divide(/) and multiple(*) Precedence are same for both
           now Precedence is same for both, so now We have to cheack Associativity
           For the multiple(*) and divide(/) Associativity is "Left to Right"
           =12-34*2
           =12-68 
           = -56
         */
        System.out.println(a);
        System.out.println(b);
        
    }
}