class Parent{
    int x = 10;
    public void display(){
        System.out.println("i am a display method in the Parent class");
    }
}
class Child extends Parent{
    int x = 20;
    public void showValues(){
        System.out.println("The value of Child class x is : " + x);
        System.out.println("The value of Parent class x is : " + super.x);
    }

    public void display(){
        super.display();
        System.out.println("I am the display method in the Child class");
    }
}
public class Skeyword {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();         //  this will give output -> i am the display method in the parent class 
                                                           // i am the display method in the child class

        child.showValues();      // this will give output  -> 20
                                 //                           10
    }
}





   
    

