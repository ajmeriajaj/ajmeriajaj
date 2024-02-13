interface Camera{
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

interface wifi{
    String[] getnetwork();
    void connectNetwork(String network);
}

class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling" + phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class mySmartPhone extends myCellPhone implements Camera, wifi{
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

public class defaultMethods {
    public static void main(String[] args) {
        mySmartPhone mi = new mySmartPhone();
        mi.takePic();
        mi.recordVideo();
        String[] arr = mi.getnetwork();
        for (String str : arr) {
            System.out.println(str);
        }
        mi.connectNetwork("iPhone");
        mi.defaultMethods();
    }
}
