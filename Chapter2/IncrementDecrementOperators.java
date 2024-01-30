public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 10;
        /* 
        i++ ---> In this case first i is assigned i then i is incremented
        ++i ---> In this case first i is incremented then i is assignment
         */
        System.out.println(i++); 
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        //quick quiz
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);

        //quick quiz
        char ch = 'a';
        System.out.println(++ch);

        //Decrement 
        int a = 10;
         /* 
        i-- ---> In this case first i is assigned i then i is Decremented
        --i ---> In this case first i is Decremented then i is assignment
         */
        System.out.println(a--); 
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a);

    }
}
