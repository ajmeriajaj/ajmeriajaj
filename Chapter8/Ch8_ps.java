class Employee{
    int salary;
    String Name;

    public int getSalary() {
        return salary;
    }

    public String getName() { 
        return Name;
    }

    public void setName(String n) {
        Name = n;
    }
}

class cellPhone {
    public void ring(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }

    public void call(){
        System.out.println("Calling...");
    }

    public void hungUp(){
        System.out.println("Call Hunging up...");
    }
}

class Square1 {

    int side;
    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }

}

class Rectangle1{
    int width;
    int length;

    public int areaOfRectangle(){
        return width*length;
    }

    public int perimeterOfRectangle(){
        return 2*(length + width);
    }
}

class TommyVecetti{
    public void Hit(){
        System.out.println("hitting...");
    } 

    public void Run(){
        System.out.println("running....");
    }

    public void Fire(){
        System.out.println("firing...");
    }

    public void getCar(){
        System.out.println("Getting car which is you want");
    }
}

class Circle2{
    float pi = 3.14f;
    int radious;

    public float areaOfCircle(){
        return pi*radious*radious;
    }

    public float perimeterOfCircle(){
        return 2*pi*radious;
    }
}

public class Ch8_ps {

    public static void main(String[] args) {
        /* 
           Q1
           Create a class Employee with following properties and methods
           Salary(property)(int)
           getSalary(method returning int)
           name(properties)(String)
           getName(method returning String)
           setName(method changing name)
         */
        Employee emp = new Employee();
        emp.setName("AJAJ AJMERI");
        System.out.println(emp.getName());
        emp.salary = 350000;
        System.out.println(emp.getSalary());

        /* 
           Q2
           Create a class Cellphone with methods to print "ringing...", "vibrating..." etc.
         */
        System.out.printf("\nPrinting All methods\n");
        cellPhone cphne = new cellPhone();
        cphne.ring();
        cphne.vibrate();
        cphne.call();
        cphne.hungUp();

        /* 
           Q3
           Create a class Square with a method to initialize its side, calculating area, perimeter etc.
         */
        System.out.printf("\nShow the answer Square of AREA and PERIMETER\n");
        Square1 sq = new Square1();
        sq.side = 10;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        /* 
           Q4
           Create a class Rectangle with a method to initialize its side, calculating area, perimeter etc.
         */
        System.out.printf("\nShow the answer Rectangle of AREA and PERIMETER\n");
        Rectangle1 rect = new Rectangle1();
        rect.length = 10;
        rect.width = 5; 
        System.out.println(rect.areaOfRectangle());
        System.out.println(rect.perimeterOfRectangle());

        /* 
           Q5
           Create a class TommyVecetti for rockstar games capable of hitting(print hitting...), running, firing, etc.
         */
        System.out.printf("\nTommy Vecetti perform some action\n");
        TommyVecetti player1 = new TommyVecetti();
        player1.Run();
        player1.Hit();
        player1.Fire();
        player1.getCar();

        /* 
           Q6
           Create a class circle  with a method to initialize its side, calculating area, perimeter etc.
         */
        System.out.printf("\nShow the answer Circle of AREA and PERIMETER\n");
        Circle2 circle = new Circle2();
        circle.radious = 5;
        System.out.println(circle.areaOfCircle());
        System.out.println(circle.perimeterOfCircle());
  
    }
}