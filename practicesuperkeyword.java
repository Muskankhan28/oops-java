class Super{
    int x;
    // constructor
    Super(){
        System.out.println(0);
    }
    // constructor overloading
    Super(int i){
        x = i;
    }
}
class Sub extends Super{
    int y;
    // constructor
    Sub(){
        System.out.println(1);
    }
    // constructor overloading
    Sub(int i , int j){
        super(i);
        y = j;
    }
}



public class practicesuperkeyword {
    public static void main(String[] args) {
        // Sub sub = new Sub();   
        
        Sub sub = new Sub(10,20);
        System.out.println(sub.x);
        System.out.println(sub.y);
    }
    
}
