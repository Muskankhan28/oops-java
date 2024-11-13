class Phone{
    public void ShowTime(){
        System.out.println("Time is 8am");
    }
    public void on(){
        System.out.println("Turning on the Phone .... ");
    }
}
class Smartphone extends Phone{
  
    public void music(){
        System.out.println("playing music");
    }
    @Override
    public void on(){
        System.out.println("Turning on the SmartPhone ....");
    }
}
public class dynamicMethodDispatch {
    public static void main(String[] args) {
        // One one = new One();
        // one.name();
        // one.greet();

       Phone obj = new Smartphone();
       // allowed
       obj.on();
       obj.ShowTime();
       // not allowed
       // obj.music(); //this will give a compliation error because we are creating an object of smartphone but assiging its refernce to a phone  
    }    
}
