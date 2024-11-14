
// interface force krta h subclasses ko agr vo implements krri h to jitne bhi methods present h interface ke andr unko implement krro subclasses ke andr 

interface Bicycle{
     int a = 67;    // you can create properties in interfaces 
     void applybreak(int decrement);
     void speedup(int increment);
}

// here i am creating one more interface 
interface bmwBike{
    void bmwcolour();
    void bmwspeed();
    void bmwbreak();
}

class AvonCycle implements Bicycle , bmwBike{
    int speed = 7;

    public void blowHorn(){
        System.out.println("Pooo Poo Pooo ...... ");
    }

    // here i have provide the implementation of applybreak() and speedup() which were there in the Bicycle interface 

    public void applybreak(int decrement){
        System.out.println("Please apply breaK");
    }
    public void speedup(int increment){
        System.out.println("speeding up the bike");
    }

    // here i am providing the implementation of bmwcolour(), bmwspeed() and bmwbreak() which were there in the bmwBike interface

    public void bmwcolour(){
        System.out.println("My bmw is of black colour");
    }
    public void bmwspeed(){
        System.out.println("bmw speed is very fast");
    }
    public void bmwbreak(){
        System.out.println("applying bmw break");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applybreak(1);
        ac.speedup(5);

        System.out.println(ac.a);   // this is allowed   you can create properities in interface


        // you cannot modify properties in interfaces as they are final 
        // every properties which is declared under interfaces cannot be modified as they are final 

        // if i try to do this 
        // i am trying to change the value of a 


        // ac.a = 345; 
        // when i try to this i will get an error because i cannot modify the properties which are declared under interfaces as they are final 


        ac.bmwbreak();
        ac.bmwspeed();
        ac.bmwcolour();
    }
    
}
