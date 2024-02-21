class myThread3 extends Thread{
    public myThread3(String name){
        super(name);
    }

    public void run(){
        int i = 1;
        while (i <= 56) {
            System.out.println("Running... " + this.getName());
            i++;
        }
        
    }
}

public class threadPriorities {
    public static void main(String[] args) {
        myThread3 t1 = new myThread3("Ajaj1");
        myThread3 t2 = new myThread3("Ajaj2");
        myThread3 t3 = new myThread3("Ajaj3 (Normal Thread)");
        t3.setPriority(Thread.NORM_PRIORITY);
        myThread3 t4 = new myThread3("Ajaj4 (Most Important Thread)");
        t4.setPriority(Thread.MAX_PRIORITY);
        myThread3 t5 = new myThread3("Ajaj5 (Not Impoprtant Thread)");
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
