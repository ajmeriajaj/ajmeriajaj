class Base{
    int x;

    public int getX(){
        return x;
    }

    public void setX(int i){
        System.out.println("I am in base and setting value of x now : ");
        this.x = i;
    }

    public void printMe(){
        System.out.println("I am don't know What i'm");
    }
}

class Derived extends Base{
    int y;

    public int getY(){
        return y;
    }

    public void setY(int n){
        this.y = n;
    }
}

class Animal{
   
    public void Eat(){
        System.out.println("Eating...");
    }

    public void Walk(){
        System.out.println("Walking...");
    }
}

class dog extends Animal{

    public void Bark(){
        System.out.println("Barking...");
    }
}



public class inheritance {
    public static void main(String[] args) {
        /*
          Inheritance is used to borrow properties and methods from an exiting Class
        */
        Base b = new Base();
        b.setX(10);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(2);
        System.out.println(d.getX());

        System.out.println("\nAnimal class : \n");
        Animal a = new Animal();
        a.Eat();
        a.Walk();
        
        dog d1 = new dog();
        d1.Eat();
        d1.Walk();
        d1.Bark();

    }
}
