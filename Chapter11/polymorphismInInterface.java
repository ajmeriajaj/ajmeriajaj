interface Camera1{
    void takePic();
    void recordVideo();

    private void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    default void defaultMethods(){
        pattern(5);
    }

}

interface wifi1{
    String[] getnetwork();
    void connectNetwork(String network);
}

class myCellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("calling" + phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class mySmartPhone1 extends myCellPhone1 implements Camera1, wifi1{
    public void takePic(){
        System.out.println("Taking Picture SuccessFully");
    }

    public void recordVideo(){
        System.out.println("Recording Video And Saved in Gallery");
    }

    public String[] getnetwork(){
        System.out.println("Getting all available networks list");
        String[] networkList = {"remi8", "vivoY30","iPhone", "samsungA54"};
        return networkList;
    }
    
    public void connectNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

public class polymorphismInInterface {
    public static void main(String[] args) {
        Camera1 camera1 = new mySmartPhone1();
        camera1.takePic();
        camera1.recordVideo();
        camera1.defaultMethods();

        wifi1 net = new mySmartPhone1();
        String[] arr = net.getnetwork();
        for (String string : arr) {
            System.out.println(string);
        }
        net.connectNetwork("samsungA54");

        mySmartPhone1 redmi = new mySmartPhone1();
        redmi.callNumber(123456);
        
    }
}
