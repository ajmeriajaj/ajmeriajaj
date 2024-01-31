public class overloading {

    /* 
       Method Overloading is "Same method name, Diffrent paramewters"
     */

    /*static void tellJokes(){
        System.out.println("ehhh... hasna halkat.. has re!");
    }
    

    static void change(int[] arr){
        arr[0] = 56;
    }
    public static void main(String[] args) {
         tellJokes();
        int[] marks = {1,2,3,4,5,6,7,8};
        change(marks);
        System.out.println("The value of x after running change is : " + marks[0]);
    }
    */

    //overLoading
    static void foo(){
        System.out.println("Good Morning!");
    }

    static void foo(String a){
        System.out.println("Good Morning "+a+" and Everyone");
    }

    public static void main(String[] args) {
        foo();  
        foo("ajaj");
        //arguments are actuals ---> ajaj is arguments
        //and a is parameters
    }
}
