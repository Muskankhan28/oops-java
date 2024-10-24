class Mobile{

    // all these are instance variables 
    String brand;
    int price ; 
    static String name;   // i want name to be same for all the objects that why i am making it as static



    // if you create a variable inside a method it is known as locall variable 
    public void print(){
        System.out.println(brand + " : " + price + " : " +name );
    }
}

class Player{
    String name;
    int id;
    static int playercount = 0;

    public Player(String name){
        this.name = name;
        id = ++playercount;

    }
    public void print(){
        System.out.println(id +" : " + name);
    }
}

public class aboutstatic {
    public static void main(String[] args) {
        // Mobile mb = new Mobile();
        // mb.brand = "apple";
        // mb.price = 15000;
        // Mobile.name = "smartphone";             // static variables should be called with a class name we can also call it with a object but its not a good practice



        // Mobile mb1 = new Mobile();
        // mb1.brand = "samsung";
        // mb1.price = 54000;
        // Mobile.name = "smartphone";


        // Mobile.name = "phone";


        // mb.print();
        // mb1.print();




        Player p1 = new Player("xyz");
        Player p2 = new Player("abc");

        p1.print();
        p2.print();


        System.out.println(Player.playercount);




        

    }
    
}
