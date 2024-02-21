class myThread extends Thread{
    public myThread(String name){
        super(name);
    }

    @Override
    public void run(){
        int i = 1;
        while (i <= 78) {
            System.out.println("This is run method form Thread Class & Thread Class extends by myThread : ");
            i++;
        }
    }
}
 
public class threadConstructors {
    public static void main(String[] args) {
        myThread t1 = new myThread("Ajaj");
        t1.start();
        
        // System.out.println("Id of the thread t1 is  : " + t1.getId());
        System.out.println("name of the thread t1 is : " + t1.getName());

    }
}
