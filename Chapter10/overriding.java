class A {
    String s;

    A(){
        s = "Hello, How are you!";
    }

    public void printMe(){
        System.out.println("I am a Method of class A : ");
    }

    public String sentance(){
        return s;
    }
}

class B extends A{
    public int ajaj(){
        return 10;
    }

    @Override
    public void printMe(){
        System.out.println("I am a Method of class B : ");
    }
}
public class overriding {
    /*
       Same method name & same parameter
       if the child class implements the same method present in the parent class again, it known as method overriding
     */
    public static void main(String[] args) {
        A a = new A();
        a.printMe();

        B b = new B();
        b.printMe();
        System.out.println(b.sentance());
        
    }
}
