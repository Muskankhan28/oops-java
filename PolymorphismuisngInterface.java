// here i have created a interface named as Gps
interface Gps{
    void startTracking();
    void stopTracking();
    void getCurrentLocation(String location);
    //  we can alsoo create private methods in the interface 
    // but we cannot directly access them 
    // we can access them by calling the private methods inside the default method
    private void grretingss(){
        System.out.println("Welcome to your GPS application .... !");
        System.out.println("How can i help you.");
    }
    //  default methods enable us to add new functionalities to an existing interface
    default void enableHighAccuracyMode(){
        grretingss();
        System.out.println("High accuracy mode enable for GPS");
    }
    default void disableHighAccuracyMode(){
        System.out.println("High accuracy mode disabled");
    }
}
// here i have created another interface named as LastestCamera
interface latestCamera{
    void takingPictures();
    void recordVideos();
    void stopVideos();
    void enableFlash();
    void disableFlash();
}
// here i have created one more interface named as updatedMediaPlayer
interface updatedMediaPlayer{
    void playMusic();
    void pauseMusic();
    void changeMusic();
    void playInDarkTheme();
    void playInLightTheme();
}

// here  i am creating a base class(parent class)

class cellPhone{
    void callCellPhone(int phoneNumber){
        System.out.println("Calling ....!" + phoneNumber);
    }
    void callPick(){
        System.out.println("Connecting the call .......");
    }
    void callEnd(){
        System.out.println("Cutting the call");
    }
}
// here i have crearted a drived class(subclass) which extends from the cellphone class and this call also implements Gps , latestCamera and updatedMediaPlayer
 class latestSmartPhone extends cellPhone implements Gps , latestCamera , updatedMediaPlayer{

    // here i am providing the implementation of Gps interface
    public void startTracking(){
        System.out.println("start traking the location");
    }
    public void stopTracking(){
        System.out.println("Stop tracking the location");
    }
    public void getCurrentLocation(String location){
        System.out.println("you current location is this : " + location);
    }

    // here i am providing the implementation of latestCamera
    public void takingPictures(){
        System.out.println("Taking the pictures");
    }
    public void recordVideos(){
        System.out.println("Recording the videos");
    }
    public void stopVideos(){
        System.out.println("Stopping the video");
    }
    public void enableFlash(){
        System.out.println("Turn on the flash");
    }
    public void disableFlash(){
        System.out.println("Turn off the flash");
    }

    // here i am providing the implementation of updateMediaPlayer
    public void playMusic(){
        System.out.println("playing wizKhalifa songs");
    }
    public void pauseMusic(){
        System.out.println("pause the music");
    }
    public void changeMusic(){
        System.out.println("change the music");
    }
    public void playInDarkTheme(){
        System.out.println("turn on the drak mode theme");
    }
    public void playInLightTheme(){
        System.out.println("turn on the default theme");
    }

    void smapleMethod(){
        System.out.println("meth");
    }
 }

public class PolymorphismuisngInterface {
    public static void main(String[] args) {
        latestCamera camera = new latestSmartPhone();  // this is a latestsmartophone use this as a camea 
    
        
    
        // jbh app latestsmartphone ko as a camera ki taraha use krte ho tbh aapko gps se koi mtlb nhi h or naah hi media player se koi mtlb h 
        // app sirf camera ke andr define methods ko hi use kr skte ho 
        // agr app gps or mediaplayers ke method ko access krne ki koshish kroge to error aaega         


        // all these will work because all these methods are defined for the camera

        camera.takingPictures();
        camera.recordVideos();
        camera.stopVideos();
        camera.enableFlash();
        camera.disableFlash();


        // this will throw an error as this is undefine for the camera 

        // camera.enableHighAccuracyMode();   -- > Not allowed

        // this will also throw an error that this method is undefined for the camera 

        // camera.changeMusic(); -- > Not allowed

        // this will also throw an error

        // camera.smapleMethod();  --> Not allowed  

        latestSmartPhone ls = new latestSmartPhone();
        ls.smapleMethod();
        ls.enableHighAccuracyMode();
        ls.playInDarkTheme();
        ls.recordVideos();
        ls.pauseMusic();
       
      
        
    }
    
}
