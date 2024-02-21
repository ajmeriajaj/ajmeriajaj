class problem1_13 extends Thread{
    public void run(){
        int i = 1;
        while (i <= 50) {
            System.out.println("Good MOrning");
            i++;
        }
    }
}

class p1_13 extends Thread{
    public void run(){
        while (true) {  //while (true) { }
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
} 

public class Ch13_ps {
    public static void main(String[] args) {
        /*
           Q1
           Write a program to print "Good Morning" and "Welcome" continuosly on the screen in java using Threads 

           Q2
           Add a sleep method in welcome Threads of Q1 to delay execution for 200ms

           Q3
           Demonstrate getPriority() and setPriority() methods in java Threads

           Q4
           How do you get State of a given Thread in java 

           Q5
           How do you get refrence to the current thread in java 
         */
        System.out.printf("\nThis is an Print GoodMorning & Welcome : \n");
        problem1_13 p1 = new problem1_13();
        p1_13 p2 = new p1_13();
        p1.setPriority(10);
        p2.setPriority(6);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p1.getState());
        p1.start();
        System.out.println(p1.getState());
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getState());
        // p2.start();

        

    }
}
