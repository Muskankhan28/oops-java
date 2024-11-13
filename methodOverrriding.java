// if the child class implements the same method present in the parent class it is known as method overrding
//we can only override 
// when the number of arugments in the function is same in both the superclass and the subclass
// accessmodifier is same return type is also same 



class A{
    public int a ;
    public int method1(){
        return 4;
    }
    public void method2(){
        System.out.println("I am a method 2 of class A");
    }
}
class B extends A{
    public void method2(){
        System.out.println("I am method 2 of class B");
    }
    public void method3(){
        System.out.println("I am a mehtod 3 of class B");
    }
}

public class methodOverrriding {
    public static void main(String[] args) {
        // here i am creating the object of class A
        A a = new A();
        a.method2();

        // here i am creating the object of class B
        B b = new B();
        b.method2();
    }
    
}
