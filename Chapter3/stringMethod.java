import java.util.Scanner;

public class stringMethod {
    public static void main(String[] args) {
        /*
          String methods operate on Java String
          In Java, the String class supports various methods, including those used to find the length of a string, convert uppercase to lowercase, and perform other operations.
         */
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(8));
        System.out.println(name.substring(4, 12));
        System.out.println(name.replace('a', 's'));
        sc.close();
        System.out.println(name.startsWith("ajaj"));
        System.out.println(name.endsWith(" "));
        System.out.println(name.charAt(1)); // which char at this index
        System.out.println(name.indexOf('j'));
        System.out.println(name.indexOf("ri", 5));
        System.out.println(name.lastIndexOf("ri"));
        System.out.println(name.lastIndexOf("aj", 5));
        System.out.println(name.equals("ajaj "));
        System.out.println(name.equalsIgnoreCase("AjAj AjmerI "));

        System.out.println("I am a escape \t Sequence");
    }
}
