// if a subclass provides implementation for all the abstract methods in the parent class 
// then the subclass can be declared as a normal class 

abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle");
    }
}

public class abstractions {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        
    }
    
}
