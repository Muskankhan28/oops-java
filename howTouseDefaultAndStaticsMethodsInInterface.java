// here i have created a interface named as MyInt 

// in an interface we can declare three types of methods 
//  -->we can declare default methods 
//  -->we can declare static methods
//  -->we can declare abstract method

// everything inside an interface is public by default weather it is a data member it is also public by default 

interface MyInt{
   // protected int x = 10;   --> not allowed in interfaces because everything inside interface is public  static and final by default
   // int x = 20;    //  i can  do this . this is allowed . this x is public static and final by default
    default void fun1(){
        System.out.println("This is function 1");
    }
    static void fun2(){
        System.out.println("This is function 2");
    }
    // this method is a abstract in interface we donot have to define it explicity comipler will automatically understand that is an abstract method
    void fun3();
}

class MyClass implements MyInt{
    public void fun3(){
        System.out.println("this is a function 3");
    }
}

public class howTouseDefaultAndStaticsMethodsInInterface {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.fun1();
        mc.fun3();
        // static methods in interface can be accessed with the help of interface name

        MyInt.fun2();   // -- > this is allowed

        // if i do this 
        // mc.fun2();     //  -->this is not allowed this will throw an error 
        
    }
    
}
