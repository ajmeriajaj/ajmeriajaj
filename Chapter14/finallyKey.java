public class finallyKey {
    public static int greet() {
        try {
            int a = 150;
            int b = 0;
            int c = a/b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Cleaing up ALL resorces... This is the end of this function");
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int d = greet();
        System.out.println(d);

        int a = 15;
        int b = 9;
        while (true) {
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am finally value of b = " + b);
            }
            b--;
        }
    }
}
