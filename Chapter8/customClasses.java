class manager {
    int id;
    String name;
    float salary;

    public float getSalarys(){
        return salary;
    }

    public void getDetails(){
        System.out.println("Id is : "+ id);
        System.out.println("Name is : "+ name);
    }
}

class Emp {
    int id;
    String name;
    double salary;
    String position;
    String cmpName;

    public void printDetail(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name);
        System.out.println("My salary is "+ salary);
        System.out.println("My position is "+ position);
        System.out.println("My company name is "+ cmpName);
    }

    public double getSalary(){
        return salary;
    }
}

class employee1 {
    int id;
    String name;

    public void printDetails(){
        System.out.println("my id is "+ id);
        System.out.println("and my name is "+ name);
    }

}

public class customClasses {
    public static void main(String[] args) {
        employee1 ajaj = new employee1(); // instantiating a new employee object
        employee1 emp = new employee1(); // instantiating a new employee object

        //setting attributes
        ajaj.id = 1;
        ajaj.name = "Ajmeri Ajaj";
        emp.id = 2;
        emp.name = "Kaif Appu";

        ajaj.printDetails(); 
        emp.printDetails();

        /* 
        System.out.println(ajaj.id);
        System.out.println(ajaj.name);
        */

        
        Emp emply = new Emp();
        emply.id = 0;
        emply.name = "Ajaj Ajmeri";
        emply.salary = 5000;
        emply.position = "employee";
        emply.cmpName = "Nothing";

        emply.printDetail();
        double slry = emply.getSalary();
        System.out.println(slry);

        manager mng = new manager();
        mng.id = 000;
        mng.name = "A Ajmeri";
        mng.salary = 750000;

        mng.getDetails();
        float slr = mng.getSalarys();
        System.out.println(slr);

        manager manager = new manager();
        manager.id = 001;
        manager.name = "AJAJ D. AJMERI";
        manager.salary = 4500000;

        manager.getDetails();
        float salary = manager.getSalarys();
        System.out.println(salary);
        

    }
}
