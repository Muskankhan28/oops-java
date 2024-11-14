
// creted a interface 
interface Camera{
    void takingSnap();
    void recordvideo();
    private void greeting(){
        System.out.println("hey snap user Good Morning!. have a nice day ");
    }
    // here i build the understand that we can use private meethods in the interface but we cannot access them then what's the point of creating private methods in interface 
    // we can access the private methods in the default method method

    // interface can use private method for default method to use 


    // default methods enable us to add new functionalities to the existiing interface
    default void recording4Kvideo(){
        greeting();
        System.out.println("recording the videos in 4k quality");
    }

}

// here i have created another interface 
interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);

}
// base class 
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling ....." + phoneNumber);
    }
    void PickCall(){
        System.out.println("connecting with the call .....");
    } 
}

// derived class
class MySmartphone extends CellPhone implements Camera , wifi{
    //  here i am providing the implementation of takingsnap() and recordvideo() that is there in the interface camera
    public void takingSnap(){
        System.out.println("taking a snap");
    }

    public void recordvideo(){
        System.out.println("recording a video");
    }

    // public void recording4Kvideo(){
    //     System.out.println("recording the SnapVideo in 4k video quality");
    // }
    


    // here i am providing the implementation of getNetworks() and connectTonetwork() that is there in the interface wifi

    public String[]getNetworks(){
        System.out.println("getting the list of network available : ");
        String[] networklist = {"harry" , "muskan" , "ronit","prashant"};
        return networklist;
    }

    public void connectToNetwork(String network){
        System.out.println("connecting to " + network);
    }
}
public class diveMoreintoInterface {
    public static void main(String[] args) {
        // here i am creating the object of the derived class

        MySmartphone sp = new MySmartphone();
        String arr[] = sp.getNetworks();
        for (String i : arr) {
            System.out.println(i);
        }        

        sp.recording4Kvideo();  // here with the help of default method you can access the private method declared inside the interface 
        // sp.greeting();       // this will throw an error because here we are trying to access the private method
    }   
}
