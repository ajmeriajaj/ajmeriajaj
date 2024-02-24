class negativeRadiusException extends Exception{
    @Override
    public String toString() {
        return super.toString() + "Radius cannot be Negative";
    }
    
    @Override
    public String getMessage() {
        return super.getMessage() + "Radius cannot be Negative";
    }
}

class newException extends Exception {
    @Override
    public String toString() {
        return super.toString() + "This is a new Exception";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "This is a new Exception";
    }
}
public class throwVsThrows {

    public static double newMeth(int r) throws newException {
        if (r>0) {
            throw new newException();
        }
        double result = r + r;
        return result;
        
    }
    
    public static double area(int r) throws negativeRadiusException{
        if (r<0) {
            throw new negativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    
    public static int divide(int a, int b) throws ArithmeticException {
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        try {
            int c = divide(4, 0);
            System.out.println(c);
        } catch(Exception e){
            System.out.println("Exception");
        }

        try {
            double A = area(15);
            System.out.println(A);
        } catch (Exception e) {
            System.out.println("Exception");
        }

        try {
            double N = newMeth(-15);
            System.out.println(N);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
