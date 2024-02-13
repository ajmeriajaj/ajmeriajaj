abstract class Parent{
    public Parent(){
        System.out.println("I am a Constructors of Class Parent");
    }

    public void sayHello(){
        System.out.println("Hello World!");
    }

    abstract public void Greet();
}

class Child extends Parent{
    @Override
    public void Greet(){
        System.out.println("BonJour");
    }

    public void switchOn(){
        System.out.println("abcdefghijklmnopqrst");
    }
}

abstract class Child2 extends Parent{
    public void print(){
        System.out.println("This is simple method");
    }
}

class Child3 extends Child{
    @Override
    public void switchOn(){
        System.out.println("1234567890");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        /*
          if a class includes abstract methods, then the class itself be declare abstract as in 
          we are not create object of abstract class, if we want to create then we are also declare abstract method in that object
         */
        Child c = new Child();
        c.Greet();
        c.sayHello();
    }
}
