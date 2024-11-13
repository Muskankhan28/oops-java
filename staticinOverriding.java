
// ALWAYS REMEBER !
// STATIC METHODS CAN NOT BE OVERRIDEN


// if you have static methods in both the base class and the derived class 
// the static methods are not overridden
// so in that case the methods are called according to there reference not according to the object 



class employees{
    static void fun(){
        System.out.println("employees is fun");
    }
}
class Sde extends employees{

    static void fun(){
        System.out.println("sde employees is fun");
    }
}
public class staticinOverriding {
    public static void main(String[] args) {
        employees e = new Sde();
        e.fun();
        
    }
    
}
