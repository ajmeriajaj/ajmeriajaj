public class methods {

    // method call by static method 
    static int logic(int a, int b) {
        int c = 40;
        if (a > b) {
            c = a + b;
        } else {
            c = (a + b) * 5;
        }
        return c;
    }

    // without static
    // int formula(int p, int q) {
    //     int r;
    //     if (p > q) {
    //         r = p + q;
    //     } else {
    //         r = (p + q) * 5;
    //     }
    //     return r;
    // }
    public static void main(String[] args) {
        int x = 2;
        int y = 10;
        int z;
        z = logic(x, y);
        System.out.println(z);

        //method invocation using object creation
        // methods obj = new methods();
        // z = obj.formula(x, y);
        // System.out.println(z);

    }
}
