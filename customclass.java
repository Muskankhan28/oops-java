class Employee{
     int id;
     int salary;
     String name;

    public void printDetails(){
        System.out.println("this is my id " +"->" + id);
        System.out.println("And my name is " +"->"+ name);
    }
    public int getSalary(){
            return salary;
    }
}

public class customclass {
    public static void main(String[] args) {
        System.out.println("this is a custom class");
        Employee em = new Employee();     // instantiating a new em object

        Employee emp = new Employee();

        // setting attributes for em
        em.id = 28;
        em.name = "muskan";
        em.salary = 34000;

        // setting attributes for emp
        emp.id = 1;
        emp.name = "anam";
        emp.salary = 90000;

        // printing the attributes
        // System.out.println(em.id);
        // System.out.println(em.name);


        em.printDetails();
        emp.printDetails();


        int salary = em.getSalary();
        System.out.println(salary);
        
    }
    
}
