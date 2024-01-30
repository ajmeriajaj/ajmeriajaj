import java.util.Scanner;

public class Ch4_ps {
    public static void main(String[] args) {
        /*
           Q1
           what will be the output of this program
           int a = 10;
           if (a = 11)
           sout("I am 11");
           else
           sout("I am not a 11")
         */
        // ANS ---> Showing error on if statement because i am assigned 11

        /*
           Q2
           write a java program to find out wheather a student is pas or fail; if it
           require total 40% and at least 33% in each subject to pass. assume 3 subjects
           and take marks as an input from the user


           Scanner sc = new Scanner(System.in);
           System.out.println("Enter your sub1 marks: ");
           byte sub1 = sc.nextByte();
           System.out.println("Enter your sub2 marks: ");
           byte sub2 = sc.nextByte();
           System.out.println("Enter your sub3 marks: ");
           byte sub3 = sc.nextByte();

          float avg = (sub1+sub2+sub3)/3.0f;
          System.out.println("overall percentage" + avg);

          // double TotalOfThreeSubMarks = sub1 + sub2 + sub3;
          // System.out.printf("Percentage of %s%n", TotalOfThreeSubMarks * 100 / 300);

          if (avg >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
              System.out.println("You are pass");
          } else {
              System.out.println("You are not pass");
          }
          sc.close();


         */

        /* 
           Q3
           Calculate income for paid by an employee to the goverment as per the slabs mentioned below :

           income Slabs        Tax
           2.5L - 5.0L         5%
           5.0L - 10.0L        20%
           Above 10.0L         30% 

           Not that there is no tax below 2.5L. Take input amount as an input from the user
         

           Scanner sc = new Scanner(System.in);
           System.out.println("Enter Your Income : ");
           double income = sc.nextDouble();

           if (income == 0 || income <= 2.5) {
              System.out.println("You don't have to pay tax");
           } else if (income > 2.5 && income <= 5.0) {
              System.out.println("You have to pay 5% tax");
           } else if (income > 5.0 && income <= 10.0) {
              System.out.println("You have to pay 20% tax");
           } else if (income > 10.0) {
              System.out.println("You have to pay 30% tax");
           } else {
             System.out.println("we are discuss and decide your tax!");
           }
          sc.close();

          Harry's Solution of Q3 

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your income : ");
          float income = sc.nextFloat();
          float tax = 0;
    
          if (income < 2.5) {
             tax = tax + 0;
          }  
          else if (income > 2.5f && income <= 5f) {
             tax = tax + 0.05f * (income - 2.5f);
          }  
          else if (income > 5f && income <= 10.0f) {
             tax = tax + 0.05f * (5.0f - 2.5f);
             tax = tax + 0.2f * (income - 5f);
          }  
          else if (income  > 10.0f) {
             tax = tax + 0.05f * (5.0f - 2.5f);
             tax = tax + 0.2f * (10.0f - 5f);
             tax = tax + 0.3f * (income - 10.0f);
          }
    
          System.out.println("The total tax paid by the employee is : " + tax);
    
          sc.close();

         */

         /*  
            Q4
            Write a java program to find out the day of the week given the number [1 for monday, 2 for tuesday ... and so on ! ]
         
            Scanner sc = new Scanner(System.in);
            int day = sc.nextInt();

            switch (day) {
             case 1:
                System.out.println("Monday");
                break;
             case 2:
                System.out.println("Tuesday");
                break;
             case 3:
                System.out.println("Wednesday");
                break;
             case 4:
                System.out.println("Thursday");
                break;
             case 5:
                System.out.println("Friday");
                break;
             case 6:
                System.out.println("Saturday");
                break;
             case 7:
                System.out.println("Sunday");
                break;
            
             default:
                System.out.println("INVALID DAY");
                break;
            }
            sc.close();
         */
         /*  
            Q5
            Write a java program to find wheather a year entered by the user is a leap year or not.
         
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Year : ");
            int year = sc.nextInt();

            if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
               System.out.println("The year is leap year");
            } else {
               System.out.println("NOT LEAP YEAR");
            }
            sc.close();
         */   

         /*  
            Q6
            Write a java program to find out the type of website from url

            .com ---> Commerscial Website
            .org ---> Organization Website
            .in  ---> Indian Website
         */ 
            Scanner sc = new Scanner(System.in);  
            String Website = sc.next();
            if (Website.endsWith(".org")) {
               System.out.println("This is an organizational website");
            } else if (Website.endsWith(".com")) {
               System.out.println("This is an commercial website");
            } else if (Website.endsWith(".in")) {
               System.out.println("This is an indian website");
            } else {
               System.out.println("I don't know about it's website");
            }
            sc.close();
        
    }
}
