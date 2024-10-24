// a final keyword can be used with a variable
// a final keyword can be used with a method
// a final keyword can be used with a class


 class Calc{                                 // once you make your class as final you are basically stopping the inheritance
                                                  // once you make a class final that means no one can extend it you are basically stopping the inheritance
         
    public final void show(){
        System.out.println("by muskan");       // onces you make your method can final no one can override it 

    }
    public void add(int a , int b){
         System.out.println(a+b);
    }
}

class AdvCalc extends Calc{                           // i want to stop the inheritence here i donnot want the the advCalc class inherit the properties of the Calc class
                                                      // so in order to make this thing possible i will simply make my class Calc final 


   public void show(){                              //  method overriding
    System.out.println("by deepak");

   }

}


public class aboutFinalKeyword {
    public static void main(String[] args) {
        // final int num = 8;
        //                                // now there is concept of making constants
        //                                // onces you make your variable constant you cannot change it now the way you can do that is by using a final keyword
        //                                // the moment you make your variable as final it means you making that variable constant

        // System.out.println(num);


        Calc c = new Calc();
        c.show();
        c.add(4, 4);
    }
    
}
