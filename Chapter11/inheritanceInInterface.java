interface Circle1{
    double area(double radius);
    double circumference(double radius);
}

interface Sphere1 extends Circle1{
    double surfaceArea(double radius);
}

class sampleClass implements Sphere1{
    @Override
    public double surfaceArea(double radius){
        return 4*Math.PI*radius*radius;
    }

    @Override
    public double area(double radius){
        return Math.PI*radius*radius;
    }

    @Override
    public double circumference(double radius){
        return 2*Math.PI*radius;
    }
}

public class inheritanceInInterface {

    public static void main(String[] args) {
        sampleClass sClass = new sampleClass();
        double circleArea = sClass.area(5);
        double circleCircumference = sClass.circumference(10);
        double sphereSurfaceArea = sClass.surfaceArea(15);

        System.out.println("Area of Circle is : " + circleArea);
        System.out.println("Circumference Circle is : " + circleCircumference);
        System.out.println("Surface Area of Sphere is : " + sphereSurfaceArea);

    }
}
