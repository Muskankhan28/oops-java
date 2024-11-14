

interface SampleInterfaces{
    void method1();
    void method2();
}
interface childInterfaces extends SampleInterfaces{
    void method3();
    void method4();
}


class MySampleClass implements childInterfaces{
    public void method3(){
        System.out.println("This is a method 3");
    }
    public void method4(){
        System.out.println("This is a method 4");
    }
    public void method2(){
        System.out.println("This is method 2");
    }
    public void method1(){
        System.out.println("This is method 1");
    }
}
public class InheritanceInInterfaces {
    public static void main(String[] args) {
        MySampleClass ms = new MySampleClass();
        ms.method2();
        ms.method4();
        ms.method1();
        ms.method3();
    }
}
