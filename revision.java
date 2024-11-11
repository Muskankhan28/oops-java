class superclass{
    public int x;
    // creating getter and setter for x
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in superclass and i am setting the value of x ");
        this.x = x;
    }
}

class subclass extends superclass{
    public int y;
    // creating getter and setter for y
    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("i am in subclass and i am setting the value of y ");
        this.y = y;
    }
}

public class revision {
    public static void main(String[] args) {
        // here i am creating the object of subclass and with the help of sc object i can access the getx() and setX() function both
        // as subclass inherits all the properties and function of the supeerclass
        subclass sc = new subclass();
        sc.setX(28);
        System.out.println(sc.getX());
        sc.setY(15);
        System.out.println(sc.getY());
        
    }
    
}
