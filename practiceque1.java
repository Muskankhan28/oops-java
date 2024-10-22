class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class cellphone{
    public void ring(){
        System.out.println("cell phone is ringing");
    }
    public void vibrate(){
        System.out.println("cell phone is vibrating");
    }
    public void callFriend(){
        System.out.println("cell phone is calling");
    }
}

class square{
    int side;

    public int squareArea(){
        return side*side;
    }

    public int paramterOfSqaure(){
        return 4*side;
    }
}

class rectangle{
    int length;
    int breath;

    public int rectangleArea(){
        return length*breath;
    }
    public int paramterOfRectangle(){
        return 2*(length+breath);
    }
}

class TommyVecetti{
    public void hit(){
        System.out.println("hitting");
    }
    public void run(){
        System.out.println("running");
    }
    public void fire(){
        System.out.println("firing");
    }
}

class circle{
    int r;
    public double areaOfCircle(){
        return 3.14*r*r;
    }
    public double parameterOfCircle(){
        return  2*3.14*r;
    }
}

public class practiceque1 {
    public static void main(String[] args) {

        // problem que 1

        Employee1 muskan = new Employee1();

        muskan.salary = 70000;
        System.out.println(muskan.getSalary());

        muskan.setName("software engineer");
        System.out.println(muskan.getName());

        // problem que 2

        cellphone phone  = new cellphone();

        phone.ring();
        phone.vibrate();
        phone.callFriend();

        // problem que 3

        square sq = new square();

        sq.side = 3;
        System.out.println(sq.squareArea());
        System.out.println(sq.paramterOfSqaure());


        // problem que 4
        
        rectangle rc = new rectangle();

        rc.length = 2;
        rc.breath = 3;

        System.out.println(rc.rectangleArea());
        System.out.println(rc.paramterOfRectangle());


        // problem que 5 

        TommyVecetti tv = new TommyVecetti();

        tv.hit();
        tv.run();
        tv.fire();


        // problem que 6 

        circle c = new circle();
        
        c.r = 5;
        System.out.println(c.areaOfCircle());
        System.out.println(c.parameterOfCircle());
        
    }
}
