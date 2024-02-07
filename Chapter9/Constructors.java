class MyMainEmployee{
    private int id;
    private String name;
    private float salary;

    public MyMainEmployee(){
        id = 65;
        name = "ABCD";
        salary = 1000;
    }

    //Constructor OverLoading
    public MyMainEmployee(int i){
        id = i;
    }

    public MyMainEmployee(String s){
        name = s;
    }

    public MyMainEmployee(float slry){
        salary = slry;
    }

    public MyMainEmployee(int i, String s){
        id = i;
        name = s;
    }

    //getters and setters
    public int getId(){
        return id;
    }

    public void setId(int i){
        id = i;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public float getSalary(){
        return salary;
    }

    public void setSalary(int yourSalary){
        salary = yourSalary;
    }
}
public class Constructors {

    public static void main(String[] args) {
        MyMainEmployee ajaj = new MyMainEmployee(101, "AJAJ");
        System.out.println(ajaj.getId());
        System.out.println(ajaj.getName());
       
        MyMainEmployee emp = new MyMainEmployee();
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}
