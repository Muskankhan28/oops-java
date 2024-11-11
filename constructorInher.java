class parent{
    parent(){
        System.out.println("I am a constructor of base class");
    }
    // constructor overloading
    parent(int a){
        System.out.println("I am an overloadedConstructor with the value of a as : " + a);
    }
    public int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    } 
}
class child extends parent{
    child(){
        // here i used super keyword so that i can call the constructor with the arguments in the base class
        //super(0);
        System.out.println("I am a constructor of child class");
    }
    // constructor overloading
    child(int a , int b){
        super(a);
        System.out.println("I am an overloaded Constructor of child class with the value of b as : " + b);
       
    }
    public int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
class child1 extends child{
    child1(){
        System.out.println("I am a constructor of child1 class ");
    }
    child1(int a, int b , int c){
        super(a,b);
        System.out.println("I am an overloaded constructor of child1 with the value of c as : " + c);
    }
}
public class constructorInher {
    public static void main(String[] args) {
        // child c = new child();
        child c = new child(14,9);

        // child1 c1 = new child1(12 ,3 ,9);
    }
}
