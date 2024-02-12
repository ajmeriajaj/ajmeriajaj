class Phone {
    public void greet(){
        System.out.println("Good Morning!");
    }

    public void on(){
        System.out.println("Turning on Phone....");
    }

}

class SmartPhone extends Phone{
    public void welcome(){
        System.out.println("Welcome Home");
    }

    @Override
    public void on(){
        System.out.println("Turning on SmartPhone....");
    }

    public void onWhatsapp(){
        System.out.println("cheak Unread Messages ");
    }

    public void wathVideo(){
        System.out.println("Wath video on YouTube");
    }
}

class computerPhone extends SmartPhone{

    public void setPassword(){
        System.out.println("Your password is ******** ");
    }

    public void restart(){
        System.out.println("restart your computerPhone");
    }

    @Override
    public void on(){
        System.out.println("Turning on computerPhone ");
    }
}

public class dynamicDispatch {
    public static void main(String[] args) {
        // Phone nokia = new Phone();
        // nokia.greet();

        // SmartPhone mi = new SmartPhone();
        // mi.welcome();
        // mi.onWhatsapp();

        // Phone redmi8 = new SmartPhone();
        // redmi8.greet();
        // redmi8.on();

        SmartPhone samsung = new computerPhone();
        samsung.greet();
        samsung.on();
    
    }
}
