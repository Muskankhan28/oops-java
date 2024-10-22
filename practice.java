class Newemployee{
    private int id;
    private int salary;
    private String name;
    // we have decalered the variables as private we cannot access them directly we can only access them with the help of method and with the help of this we can implement data hiding

    // getter and setter methods

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }


    public void setSalary(int n){
        this.salary = n;
    }
    public int getSalary(){
        return salary;
    }



    public void setName(String s){
        name = s;
    }
    public String getname(){
        return name;
    }
}


public class practice {
    public static void main(String[] args) {
        Newemployee ne = new Newemployee();
        ne.setId(34);
        System.out.println(ne.getId());

        ne.setSalary(98000);
        System.out.println(ne.getSalary());

        ne.setName("software developer muskan khan");
        System.out.println(ne.getname());
    }
    
}
