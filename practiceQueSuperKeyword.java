class Main{
    int x = 100;
}
class Children extends Main{
    int x = 456;
    public void display(){
        System.out.println(super.x);
        System.out.println(x);
    }

}

public class practiceQueSuperKeyword {
    public static void main(String[] args) {
        Children children = new Children();
        children.display();   
    }   
}
