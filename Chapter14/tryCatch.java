public class tryCatch {
    public static void main(String[] args) {
        int a = 10000;
        int b = 0;
        try {
            int c = a/b;
            System.out.println("The result of c is : " + c);
        } catch(Exception e) {
            System.out.println("We failed to divide . Reason : ");
            System.out.println(e);
        }
        System.out.println("End of the Program");
    }
}
