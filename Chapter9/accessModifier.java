class MyEmployee{
    private int id;
    private String name;

    public int getId(){
        return id;
    }
    
    public void setId(int i){
        this.id = i;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }
}

public class accessModifier {
    public static void main(String[] args) {
        /* 
           Access modifiers is specifie where a property/methods is accesible
           There are four types of access modifiers in java
           Private
           Defaults
           Protects
           Public
         */

         MyEmployee myEmp = new MyEmployee();
         myEmp.setId(1);
         System.out.println(myEmp.getId());
         myEmp.setName("AJAJ D. AJMERI");
         System.out.println(myEmp.getName());
    } 
}
