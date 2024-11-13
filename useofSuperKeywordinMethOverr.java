// USING SUPER KEYWORD IN METHOD OVERRIDING 3
class parentss{
    void fun(){
        System.out.println("Parents is fun");
    }
}
class childss extends parentss{
    @Override
    void fun(){
        // we can call parentss class fun() byy simply using super keyword 
        super.fun();
        System.out.println("childs is fun");
    }
}

public class useofSuperKeywordinMethOverr {
    public static void main(String[] args) {
        childss cs = new childss();
        cs.fun();             
    }
}
