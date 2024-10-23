// java code for this keyword
// this is the keyword that refers to the current instance of a class

class Test{
    int a;
    int b;

    // parameterized constructor
    Test(int a , int b){
        this.a = a;
        this.b = b;
    }
    public void display(){
        // displaying the value of a and b
        System.out.println("a = "+a + " " + "b = "+b);
    }
}

 
// Java code for using this() to 
// invoke current class constructor

class Test1{
    int a;
    int b;

    // default constructor
    Test1(){
        this(10,20);
        System.out.println("Inside the default constructor");
    }
    Test1(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Inside the paramterized constructor");
    }
}



//Java code for using 'this' keyword 
//to return the current class instance
class Test2{
    int a;
    int b;
    int c;


    Test2(){
        a=10;
        b=20;
    }
    Test2 get(){
        return this;
    }
    public void display(){
        System.out.println("a -> " + a +" "+ "b ->  " + b +" " +"c -> "+c);
    }
}



// Java code for using 'this' 
// keyword as method parameter
class Test3{
    int a;
    int b;

    // default constructor
    Test3(){
        a = 10;
        b = 20;
    }
    public void display(Test3 obj){
        System.out.println("a = "+ obj.a + " " +"b = "+ obj.b);
    }
    public void get(){
        display(this);
    }
}



// Java code for using this to invoke current 
// class method
class Test4{
    void display(){
        this.show();
        System.out.println("Inside display function");
    }
    void show(){
        System.out.println("Inside show functon");
    }
}


public class keywordThis {
    public static void main(String[] args) {
        // Test obj = new Test(10,20);
        // obj.display();


        // Test1 test = new Test1();

        // Test2 tt = new Test2();
        // tt.get().display();


        // Test3 t = new Test3();
        // t.get();


        Test4 te = new Test4();
        te.display();
    }
}
