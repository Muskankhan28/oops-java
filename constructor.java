class Mymainemployee{
    private int id;
    private String name;

    public void setId(int n){
        this.id = n;
    }

    public int getId(){
        return id;
    }

    public void setName(String s){
        this.name = s;
    }

    public String getName(){
        return name;
    }
    


    // here we have created a constructor 

    // constructor automatically invoke ho jata hai object creation ke time par hi

    // public Mymainemployee(){
    //      id = 456;
    //      name = "Ayaz Ahmed";
    // }

    


    // this is a paratmeriterized constructor 

    public Mymainemployee(String myname , int i){
        this.id = i;
        this.name = myname;

   }


}

public class constructor {
    public static void main(String[] args) {
        Mymainemployee employee = new Mymainemployee("Programming with Muskan Khan" , 28);

        // employee.setId(45);
        // System.out.println(employee.getId());


        //  employee.setName("SDE Muskan khan");
        //  System.out.println(employee.getName());

        System.out.println(employee.getName());
        System.out.println(employee.getId());
        
    }
    
}
