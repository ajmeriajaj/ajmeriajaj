public class varArgs {

    // static int sum(int a, int b) {
    //     return a + b;
    // }
    // static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }
    // static int sum(int a, int b, int c, int d) {
    //     return a + b + c + d;
    // }
    // static int sum(int a, int b, int c, int d, int e) {
    //     return a + b + c + d + e;
    // }

    static int sum(int a, int ...arr){
        int results = 0;
        for (int i : arr) {
            results += i; 
        }
        return results;
    }
    
    public static void main(String[] args) {
        /*
           VarArgs 
           You can give more than one argument to a function
         */  
        System.out.println("Welcome to VarArgs : ");
        //System.out.println("The value of nothing :" + sum()); ---> if i run this line then throw error because of the one value is the compulsary to enter and i this is the blanks it's for throws error
        //atleast one integer value required now 
        System.out.println("The value of a and b is :" + sum(5, 10));
        System.out.println("The value of a, b and c is :" + sum(1,2,3));
        System.out.println("The value of a, b, c, and d is :" + sum(1, 02, 3, 4));
        System.out.println("The value of a, b, c, d, and e :" + sum(5, 10, 5,7,8));
        
    }
}
