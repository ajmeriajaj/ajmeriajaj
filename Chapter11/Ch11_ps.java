abstract class Pen{
    abstract public void write();
    abstract public void refill();
}

class fountainPen extends Pen{

    @Override
    public void write(){
        System.out.println("You can write anything :");
    }

    @Override
    public void refill(){
        System.out.println("OOPS!, Your pen is empty please refill it.");
    }

    public void changeNib(){
        System.out.println("You can also change nib in your pen");
    }

}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    public void jump(){
        System.out.println("Jumping one tree to second tree");
    }

    public void bite(){
        System.out.println("Biting...");
    }   
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating...");
    }

    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }

    public void run(){
        System.out.println("Running...");
    }
}

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelePhone extends TelePhone{
    public void palyMusic(){
        System.out.println("Playing Song");
    }

    @Override
    public void ring(){
        System.out.println("Ringing...");
    }

    @Override
    public void lift(){
        System.out.println("Call Lifting...");
    }

    @Override
    public void disconnect(){
        System.out.println("Hang up Call");
    }
}

interface TVRemote{
    void on();
    void off();
}

interface SmartTVRemote extends TVRemote{
    void changeChannel();
    void setVolume(int n);
}

class TV implements TVRemote{
    public void watch(){
        System.out.println("Watching TV");
    }

    @Override
    public void on(){
        System.out.println("TV is on");
    }

    @Override
    public void off(){
        System.out.println("TV is Off");
    }
}

public class Ch11_ps {
    public static void main(String[] args) {
        /*
           Q1
           Create an abstract class pen with methods write() and refill() as abstract methods
         */

        /*
           Q2
           Use the Pen class from Q1 to create a concrete class fountainPen with additional method changeNib()
         */ 
        System.out.printf("\nUsed Pen Class and thier methods : \n");
        fountainPen pen = new fountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();

        /*
           Q3
           Create a Class Monkey With jump() and bite() methods. Create a class Human which inherits this Monkey Class and implements BasicAnimal interface with eat() and sleep() methods
         */ 

        /*
           Q5
           Demonstrate polymorphism using Monkey Class from Q3 
         */  
        System.out.printf("\nUsed Human Class and interface & methods : \n");
        Human men = new Human();
        men.jump();
        men.bite();
        men.eat();
        men.sleep();
        men.run();

        BasicAnimal bAnimal = new Human();
        bAnimal.eat();
        bAnimal.sleep();

        Monkey m = new Human();
        m.jump();
        m.bite();

        /*
           Q4
           Create a Class TelePhone with Ring(), lift() and disconnect() methods as abstarct methods Create another class SmartTelePhone and Demonstrate polymorphism 
         */ 
        System.out.printf("\nThis is for SmartTelePhone : \n");
        SmartTelePhone sTelePhone = new SmartTelePhone();
        sTelePhone.palyMusic();
        sTelePhone.ring();
        sTelePhone.lift();
        sTelePhone.disconnect();

        TelePhone tPhone = new SmartTelePhone();
        tPhone.ring();
        tPhone.lift();
        tPhone.disconnect();
        
        /*
           Q6
           Create an interface TVRemote and use it to inherit another SmartTVRemote
         */

        /*
           Q7
           Create a Class Tv which implements TVRemote interface from Q6
         */
        System.out.printf("\nThis is Q6 and Q7 : \n");
        TV tv = new TV();
        tv.on();
        tv.watch();
        tv.off();

        SmartTVRemote sTvRemote = new SmartTVRemote() {
            @Override
            public void changeChannel(){
                System.out.println("Change Channel And Watch Discovery");
            }

            @Override
            public void setVolume(int n){
                System.out.println("set volume as you want " + n);
            }

            @Override
            public void on(){
                System.out.println("On TV");
            }

            @Override
            public void off(){
                System.out.println("TV Off");
            }
        };
        sTvRemote.on();
        sTvRemote.changeChannel();
        sTvRemote.setVolume(20);
        sTvRemote.off();
    }
}
