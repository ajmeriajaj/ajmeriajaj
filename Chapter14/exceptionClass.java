import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString() {
        return super.toString() + "I am a toString";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "I am a getMessage";
    }
}

class maxAgeException extends Exception{
    @Override
    public String toString() {
        return super.toString() + "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "Make sure that the value of age entered is correct";
    }
}

public class exceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 9) {
            try {
                throw new myException();
            } catch (Exception e) {
                // System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            } finally {
                sc.close();
            }
        }
        System.out.println("finished");
        
    }
}
