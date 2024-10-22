class Employees{
    private int id;
    private String name;

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }   
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }


    // constructor

    public Employees(String n ,  int i){
        this.id = i;
        this.name = n;
    }
}

public class practicecons {
    public static void main(String[] args) {
        Employees emp = new Employees("hi i am sde muskan khan" , 28);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        
    }
    
}
