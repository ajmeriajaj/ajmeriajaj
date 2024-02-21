class myThread4 extends Thread{
    public void run(){
        // int i = 1;
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Hello, I am a run method of Class myThred4 which is extends by Class Thread : ");
            // i++;
        }
    }
}

class myThread5 extends Thread{
    public void run(){
        int i = 1;
        while (i <= 48) {
            System.out.println("Hello, I am a run method of Class myThred5 which is extends by Class Thread : ");
            i++;
        }
    }
}

class myThread6 implements Runnable{
    public void run(){
        int i = 1;
        while (i <= 48) {
            System.out.println("Hello, I am a run method of Class myThred6 which is Implementys by Runnable Interface : ");
            i++;
        }
    }
}

class myThread7 implements Runnable{
    public void run(){
        int i = 1;
        while (i <= 48) {
            System.out.println("Hello, I am a run method of Class myThred7 which is Implementys by Runnable Interface : ");
            i++;
        }
    }
}

public class threadMethods {
    public static void main(String[] args) {
        myThread4 t1 = new myThread4();
        // myThread5 t2 = new myThread5();
        t1.start();
        // try {
        //     t1.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // t2.start();

        // myThread6 t3 = new myThread6();
        // Thread t4 = new Thread(t3);
        // t4.start();

        // myThread7 t5 = new myThread7();
        // Thread t6 = new Thread(t5);

        // t1.start();
        // try {
        //     t1.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // t2.start();
        // t4.start();
        // try {
        //     t4.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // t6.start();


    }
}
