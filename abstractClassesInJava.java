// here i have created a abstract class Shape
// abstract classes can have both abstract method(a method that is declared without any implementation is known as abstract method)  
// and non abstract methods are concrete methods (we basically known the implementation of these methods).

// if a subclass provides implementation for all the abstract method in the parent class 
//  --> then the subclass can be declared as the normal class 

// but id the subclass doesnot provide implementation for all the abstract methods in the parent class 
// --> then the subclass must be declared as the abstract
// --> and it also means that the subclass is incomplete and must be further extended 

// a class is called abstract when we use abstract keyword before it.

abstract class Shape{
    int colour;
    int getColour(){
        return colour;
    }
    //creating a constructor
    Shape(int c){
        colour = c;
    }
    // created a abstact method getArea() 
    // here a method is declared without any implementation that's why is it a abstract method
    abstract double getArea();
}
class Square extends Shape{
    double side;
    // created a constructor of Square class
    Square(int c , double s){
        // here i am calling the constructor of the base class using the super keyword
        super(c);
        side = s;
    }
    // the method getArea() which is declared in the base class Shape. here i have provide its implementation in the derived class Square 
    double getArea(){
        return side * side;
    }
}
public class abstractClassesInJava {
    public static void main(String[] args) {
        // here i have created the object of the Square class
        Square s = new Square(5, 10.0);
        System.out.println(s.getArea());
    }
}
