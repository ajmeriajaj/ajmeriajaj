class Base1{

        Base1(){
            System.out.println("I am a Constructor");
        }

        Base1(int a){
            System.out.println("I am an overloaded Constructor with value of a : " + a);
        }

    // public int x;

    // public int getX(){
    //     return x;
    // }

    // public void setX(int x){
    //     this.x = x;
    // }
}

class Derived1 extends Base1{

    Derived1(){
        //super(10);
        System.out.println("I am a Constructors of Derived Class ");
    }

    Derived1(int a, int b){
        super(a);
        System.out.println("I am an overloaded Constructor with value of b : " + b);
    }

    // public int y;

    // public int getY(){
    //     return y;
    // }

    // public void setX(int y){
    //     this.y = y;
    // }
}

class childDerived extends Derived1{
    childDerived(){
        System.out.println("I am a child of derived constructor");
    }

    childDerived(int a, int b, int c){
        super(a, b);
        System.out.println("I am a overloaded constructor with value of c :  " + c);
    }
}

public class inheritanceWithConstructors {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        //Derived1 d = new Derived1();
        Derived1 d = new Derived1(10, 5);
        childDerived cd = new childDerived(15, 10, 5);


        System.out.println(d); // show the className@<Hashcode>
        System.out.println(cd); // show the className@<Hashcode>
    }
    
}
