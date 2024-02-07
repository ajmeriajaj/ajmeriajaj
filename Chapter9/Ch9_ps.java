class Cylinder {
    // float pi = 3.14f;
    private int radious;
    private int height;

    public Cylinder(int radious, int height){
        this.radious = radious;
        this.height = height;
    }

    public Cylinder(){
        radious = 10;
        height = 5;
    }
    
    public int getRadious(){ 
        return radious;
    }

    public void setRadious(int radious){
        this.radious = radious;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radious*height + 2*Math.PI*radious*radious;
    }

    public double volumeOfCylinder(){
        return Math.PI*radious*radious*height;
    }



}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        length = 4;
        breadth = 5;
    }

    public Rectangle(int l, int w){
        length = l;
        breadth = w;
    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

    

}

class Square{
    private int side;

    public Square(){
        side = 4;
    }

    public Square(int n){
        side = n;
    }

    public int getside(){
        return side;
    }

    public void setSide(int s){
        side = s;
    }

    public int areaOfSquare(){
        return side * side;
    }

    public int perimeterOfSquare(){
        return 4 * side;
    }

    

    
}

class Sphere{
    private double radious;

    public Sphere(){
        radious = 5;
    }

    public Sphere(int n){
        radious = n;
    }

    public double getRadious(){
        return radious;
    }

    public void setRadious(int n){
        radious = n;
    }

    public double surfaceArea(){
        return 4*Math.PI*radious*radious;
    }

    public double volume(){
        return (4.0/3.0) * Math.PI * Math.pow(radious, 3);
    }

    public double diameter(){
        return 2*radious;
    }

    
}

class Circle{
    private double radious;
    
    public Circle(){
        radious = 5;
    }

    public Circle(double n){
        radious = n;
    }

    public double getRadious(){
        return radious;
    }

    public void setRadious(int n){
        radious = n;
    }

    public double areaOfCircler(){
        return Math.PI * Math.pow(radious, 2); 
    }

    public double circumferenceOfCircle(){
        return 2 * Math.PI * radious;
    }

}

public class Ch9_ps {
    public static void main(String[] args) {
        /* 
          Q1
          Create a class Cylinder and use getters and setters to set its radious and height
         */
        System.out.printf("\nCylinder\n");
        Cylinder myCylinder = new Cylinder(); 
        // myCylinder.setRadious(10);
        System.out.println(myCylinder.getRadious());
        // myCylinder.setHeight(5);
        System.out.println(myCylinder.getHeight());

        /* 
          Q2
          use 1. to calculate surface area and volume of the cylinder
         */
        System.out.println("Surface area and volume of the cylinder\n");
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volumeOfCylinder());
        
        /* 
          Q3
          use a constructor and repeat 1.
         */
        System.out.printf("\nCylinder\n");
        Cylinder cylinder = new Cylinder(6, 3);
        System.out.println(cylinder.getRadious());
        System.out.println(cylinder.getHeight());
        

        /* 
          Q4
          Overloaded a constructors used to initialize a rectangle of lenght 4 and breadth 5 for using custom parameter
         */
        System.out.printf("\nConstructors with parameters\n");
        Rectangle rectangle = new Rectangle(10, 6);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getBreadth());

        System.out.printf("\nConstructors without paramters\n");
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getBreadth());

        /* 
          Q5
          Repeat 1. for square
         */
        System.out.printf("\nSquare Construtors without parameters\n");
        Square square = new Square();
        square.setSide(5);
        System.out.println(square.getside());
        System.out.println(square.areaOfSquare());
        System.out.println(square.perimeterOfSquare());

        System.out.printf("\nSquare Consteructors with one parameters\n");
        Square square2 = new Square(55);
        System.out.println(square2.getside());
        System.out.println(square2.areaOfSquare());
        System.out.println(square2.perimeterOfSquare());

        /* 
          Q6
          Sphere
         */
        System.out.println("\nSphere\n");
        Sphere sphere = new Sphere();
        //sphere.setRadious(4);
        System.out.println(sphere.getRadious());
        System.out.println(sphere.surfaceArea());
        System.out.println(sphere.volume());
        System.out.println(sphere.diameter());

        System.out.println("\nSphere with parameterized constructors\n");
        Sphere sphere2 = new Sphere(10);
        System.out.println(sphere2.getRadious());
        System.out.println(sphere2.surfaceArea());
        System.out.println(sphere2.volume());
        System.out.println(sphere2.diameter());

        /* 
          Q7
          Circle
         */
        System.out.println("\nCircle without parameter\n");
        Circle circle = new Circle();
        circle.setRadious(11);
        System.out.println(circle.getRadious());
        System.out.println(circle.areaOfCircler());
        System.out.println(circle.circumferenceOfCircle());

        System.out.println("\nCircle with parameter\n");
        Circle circle2 = new Circle(10);
        System.out.println(circle2.getRadious());
        System.out.println(circle2.areaOfCircler());
        System.out.println(circle2.circumferenceOfCircle());

        
    }
}
