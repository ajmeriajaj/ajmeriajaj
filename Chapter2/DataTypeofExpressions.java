public class DataTypeofExpressions {
    public static void main(String[] args) {
        /* 
          Result = byte + short -> integer
          Result = long + float -> float
          Result = short + integer -> integer
          Result = integer + float -> float
          Result = character + integer -> integer
          Result = character + short -> integer
          Result = long + double -> double
          Result = float + double -> double
         */

         byte x = 5;
         int y = 6;
         short z = 8;
         int a = y + z;
         float b = 6.54f + x;
         System.out.println(a);
         System.out.println(b);
    }
}
