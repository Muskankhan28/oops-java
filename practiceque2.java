class Cylinder{
    private int radius ;
    private int height;

    public void setRadius(int r){
        this.radius = r;
    }
    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        this.height = h;
    }
    public int getHeight(){
        return height;
    }

    public double SurfaceAreaOfCylinder(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }

    public double volumeOfCylinder(){
        return Math.PI*radius*radius*height;
    }

    // constructor

    public Cylinder(int r , int h){
        this.radius = r;
        this.height = h;
    }

}

class RectangleArea{
    int length;
    int breath;

    public void setLength(int l){
        length = l;
    }

    public int getLength(){
        return length;
    }

    public void setBreath(int b){
        breath = b;
    }
    
    public int getBreath(){
        return breath;
    }

    public int AreaofRectangle(){
        return length*breath;
    }

   // constructor

    public RectangleArea(int l , int b){
        this.length = l;
        this.breath = b;
    }
}

public class practiceque2 {
    public static void main(String[] args) {

        // practice que 1

        // Cylinder c = new Cylinder();
        // c.setRadius(9);
        // System.out.println(c.getRadius());

        // c.setHeight(12);
        // System.out.println(c.getHeight());


        // practice que 2

        // double surfacearea = c.SurfaceAreaOfCylinder();
        // System.out.println(surfacearea);

        // double surfacevolume = c.volumeOfCylinder();
        // System.out.println(surfacevolume);


        // practice que 3

        // Cylinder cy = new Cylinder(9,12);
        // System.out.println(cy.getRadius());
        // System.out.println(cy.getHeight());


        // practice que 4 

        RectangleArea r = new RectangleArea(4, 5);

        System.out.println(r.getBreath());
        System.out.println(r.getLength());
        System.out.println(r.AreaofRectangle());


      

    }
    
}
