class Base2{
    void fun(){
        System.out.println("base is fun ");
    }
}
class Derived2 extends Base2{
    @Override
    void fun(){
        System.out.println("Derived is fun");
    }
}

public class methodOverrExam {
    public static void main(String[] args) {
        Base2 b = new Derived2();            // base class reference can referr to an object of a derived class
        b.fun();
    }
}
