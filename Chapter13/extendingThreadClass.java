class myThread1 extends Thread{
    @Override
    public void run(){
        int i = 1;
        while (i <= 25) {
            System.out.println("myThread1 is running ");
            System.out.println("it's good ");   
            i++;  
        }
        
    }
}

class myThread2 extends Thread{
    @Override
    public void run(){
        int i = 1;
        while (i <= 25) {
            System.out.println("myThread2 is running ");
            System.out.println("it's good for myThread2 ");
            i++;
        }
        
    }
}

public class extendingThreadClass {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
