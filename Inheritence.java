
// this is a base class or we can say that a parent class
class Base{

    // instance variabel 
    public int x;

   //  creating getter and setter for x 
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base class and i am setting the value of x now");
        this.x = x;
    }

    public void print(){
        System.out.println("i am muskan khan");
    }
}

// creating a derived class which will inherit all the properities of a base class(parent class)

// extend keyword is used to achieve inheritance

class Derived extends Base{
    //  instance variable
    
    public int y;

    // creating getter and setter methid for y 

    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("i am in a derived class and i am setting the value of y");
        this.y = y;
    }


}

public class Inheritence {
    public static void main(String[] args) {
        // creating object for base class
        
        // Base b = new Base();
        // b.setX(4);
        // System.out.println(b.getX());


        // creating a object for derived class 

        Derived d = new Derived();

        // here i have created a object of derive class and i have inherited all the properties and method of base class using the extend keyword
        // so because of this the object of derived class is also able to access all the methods and properties of a base class

        d.setX(34);
        System.out.println(d.getX());


        d.setY(56);
        System.out.println(d.getY());
        
    }
    
}
