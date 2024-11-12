// this Employee class is my superclass
class Employee{
    // declared two instance variables id and salary
    int id;
    int salary;
    // created a constructor
    Employee(int i , int s){  
        id = i;
        salary = s;
    }
}
// this SalesEmp is my subclass
class SalesEmp extends Employee{
    // declared a instance variable salesIncrement
    int salesIncrement ;
    // created a Constructor
    SalesEmp(int i , int s , int si){
        // with the the help of super keyword i am calling the constructor of parent class which have 2 parameters
        super(i,s);
        salesIncrement = si;
    }
}
public class PracticeQuestions {
    public static void main(String[] args) {
        // created the object of SalesEmp class
        SalesEmp se = new SalesEmp(101, 3000, 1000);
        System.out.println(se.salary);
        System.out.println(se.id);
        System.out.println(se.salesIncrement); 
    }
}
