class Circle3{
    public int radious;

    Circle3(int r){
        System.out.println("I am a parameterized Constructors of Circle Class");
        this.radious = r;
    }

    public double area(){
        return Math.PI*radious*radious;
    }
}

class Cylinder1 extends Circle3{
    public int height;

    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am a parameterized Constructors of Cylinder Classs");
        this.height = h;
    }

    public double area(){
        return 2*Math.PI*radious*height + 2*Math.PI*radious*radious;
    }

    public double volume(){
        return Math.PI*radious*radious*height;
    }
} 

class Rectangle2{
    public int length;
    public int width;

    private int height;

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int h){
        this.height = h;
    }

    Rectangle2(int l, int w){
        System.out.println("This is a Param Constructors of Class Rectangle");
        this.length = l;
        this.width = w;
    }

    public int areaRect(){
        return width * length;
    }

    public int volumeOfRect(){
        return length*width*height;
    }
}

class Cuboid extends Rectangle2{
    public int height;

    Cuboid(int l, int w, int hei){
        super(l, w);
        System.out.println("This a Param Constructors of Class Cuboid");
        this.height = hei;
    }

    public int SAOfCuboid(){
        return 2*length*width + 2*length*height + 2*height*width;
    }
}

public class Ch10_ps {
    public static void main(String[] args) {
        /*
           Q1
           Create a class Circle and use inheritance to create another class Cylinder from it
         */
        // System.out.printf("\nThis is Class circle and cylinder : \n");
        // Circle3 c = new Circle3(10);
        // System.out.println(c.area());
        // Cylinder1 c1 = new Cylinder1(10, 5);
        // System.out.println(c1.area());
        // System.out.println(c1.volume());

        /*
           Q2
           Create a class Rectangle and use inheritance to create another class Cuboid. Try tp reep it as close to real world Scinario as posible
         */
        System.out.printf("\nThis is Class rectangle and cuboid : \n");
        Rectangle2 r = new Rectangle2(10, 5);
        System.out.println(r.areaRect());
        r.setHeight(5);
        System.out.println(r.getHeight());
        System.out.println(r.volumeOfRect());
        Cuboid cub = new Cuboid(10, 5, 8);
        System.out.println(cub.SAOfCuboid());
        
    }
}
