class oneClass {
    int a;

    oneClass(int a){
        //a = a;  show warning 
        this.a = a;
    }

    public int getA(){
        return a;
    }

    public int returnOne(){
        return 1;
    }
}

class twoClass extends oneClass{
    twoClass(int c){
        super(c);
        System.out.println("I am a constructors ");
    }
}

public class thisSuper {
    public static void main(String[] args) {
        oneClass obj = new oneClass(5);
        System.out.println(obj.getA());

        twoClass obj1 = new twoClass(10);

        System.out.println(obj1); // show className@<hashcode>
        

    }
}
