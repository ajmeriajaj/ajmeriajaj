interface Bicycle{
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface forLoop{
    void simpleLoop(int n);
    void reverseSimpleLoop(int n);
}

interface whileLoop1{
    void loops(int n);
}

interface onlyPrint{
    void greet();
}

class Print implements onlyPrint{
    public void greet(){
        System.out.println("Welcome");
    }
}

class patterns implements whileLoop1{
    public void loops(int n){
       int i = 1;
       while (i<=n) {
        int j = 1;
        while (j<=n) {
            System.out.print("* ");
            j++;
        }
        i++;
        System.out.println();
       }

    }
}

class Cycle extends patterns implements Bicycle, forLoop{
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }

    public void speedUp(int increment){
        System.out.println("Speed Increase");
    }

    public void simpleLoop(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public void reverseSimpleLoop(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

}

public class interfaces {
    public static void main(String[] args) {
        /*
           In Java interface is a group of related methods with empty bodies
         */   
        Cycle cycle = new Cycle();
        cycle.applyBreak(1);
        cycle.speedUp(30);
        cycle.simpleLoop(5);
        cycle.reverseSimpleLoop(5);

        patterns p = new patterns();
        p.loops(5);

        patterns patterns = new Cycle();
        patterns.loops(5);

        Print print = new Print();
        print.greet();

        Bicycle b1 = new Cycle();
        b1.applyBreak(5);
        b1.speedUp(80);   
        
        
    }
}
