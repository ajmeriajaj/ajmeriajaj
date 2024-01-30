import java.util.Scanner;

public class Ch3_ps {
    public static void main(String[] args) {
        /*   
           Q1   
           write a java program to convert a string to lowercase
         */
        String name = "Ajaj Ajmeri";
        name = name.toLowerCase();
        System.out.println(name);

        /*   
           Q2  
           write a java program to replace space with underscore
         */
        String str = "Ajaj Ajmeri";
        System.out.println(str.replace(' ', '_'));

        /*   
           Q3
           write a java program to fill in a letter templete which looks like below
           letter = "Dear <|name|>, Thanks a lot"  
           Replace <|name|> with a String (Some Name)
         */
         Scanner sc = new Scanner(System.in);
         String Name = sc.nextLine();
         System.out.println("Dear " + Name + ", Thanks a lot");
         sc.close();

        /*   
           Q4
           write a java program to detect double and triple space in a string
         */ 
        String name1 = "  AJAJ   AJMERI";
        System.out.println(name1.indexOf("  "));
        System.out.println(name1.indexOf("   "));


        /*   
           Q5
           write a java program to format the following letter using escape sequence character 
           letter = "Dear Harry, This Java course is nice. Thanks"
         */ 
        String letter = "Dear Harry,\n\t This Java course is nice.\nThanks!";
        System.out.println(letter);

    }
}
