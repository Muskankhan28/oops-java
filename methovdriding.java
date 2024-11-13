class parents1{
    void fun(){
        System.out.println("Parent is fun");
    }
}
class childs1 extends  parents1{
    @Override
    void fun(){
        System.out.println("child is fun");
    }
}
class grandchilds1 extends childs1{
    @Override
    void fun(){
        System.out.println("grandchild is fun");
    }
}
public class methovdriding {
    public static void main(String[] args) {
        parents1 p = new childs1();
        parents1 p2 = new grandchilds1();
        p.fun();
        p2.fun();
        
    }
}
