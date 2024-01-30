import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

          // for (int i = 0; i <= num; i++) {
          //   if (i == 2) {
          //       continue;
          //   }
          //   System.out.println(i);
          //   System.out.println("learning java");
          // }

          int i = 0;
          while (i <= num) {
            if (i == 10) {
              i++;
                continue;
            }
            System.out.print(i + " ");
            System.out.println("learning java");
            i++;
            
          }

          // int i1 = 0;
          // do {
          //   i1++;
          //   if (i1 == 10) {
          //       continue;
          //   }
          //   System.out.print(i1 + " ");
          //   System.out.println("learning java");
            
          // } while (i1 < num);
        sc.close();
    }
}
