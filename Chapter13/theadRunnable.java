class myThreadRunnable1 implements Runnable{   
    public void run(){
        int i = 0;
        while (i < 50) {
            System.out.println("I am a Thread not a threat");
            i++;
        }
        
    }
}

class myThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while (i < 50) {
            System.out.println("I am a Thread 2 not a threat 2");
            i++;
        }
        
    }
}
public class theadRunnable {
    public static void main(String[] args) {
        myThreadRunnable1 t1 = new myThreadRunnable1();
        Thread th1 = new Thread(t1);
        
        myThreadRunnable2 t2 = new myThreadRunnable2();   
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();
        
        
    }
}
