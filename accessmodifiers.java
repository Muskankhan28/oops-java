class Myemployee{
    private int id;
    private String name;
    private int salary;

    // we can access these variables with the help of methods and with the help of this we can implement data hiding 

    // getter and setter methods

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }

    public void setId(int i){
        this.id = i;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int s){
       if(s>0){
        this.salary = s;
       }
       else{
        System.out.println("salary must be positive");
       }
    }
}

public class accessmodifiers {
    public static void main(String[] args) {
        Myemployee mus = new Myemployee();

        // throw an error due to private access modifiers

        // mus.id = 38;
        // mus.name = "Muskan khan";
        // System.out.println(mus.id);
        // System.out.println(mus.name);

        mus.setName("Muskan Khan");
        mus.setId(28);
        mus.setSalary(96000);

        System.out.println(mus.getName());
        System.out.println(mus.getId());
        System.out.println(mus.getSalary());
        
    }
    
}
