package Inheritance;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    super();
    this.height=1.0;
}
   public Cylinder(double height){
      super();
      this.height=height;
}
    public Cylinder(double height,double radius){
      super(radius);
      this.height=height;
}
     public Cylinder(double height,double radius,String color){
    super(radius,color);
    this.height=height;
}

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
public double getVolume(){
        return getArea()*height;
}
    @Override
    public String toString() {
        return "this is a Cylinder";
    }

    public static void main(String[] args) {
        Cylinder C1 =new Cylinder();
        System.out.println("radius is :" + C1.getRadius()+
        ","+"Height is:"+C1.getHeight()+
        ","+"Area is:"+C1.getArea()+
        ","+"volume is:"+C1.getVolume());

        Cylinder C2 = new Cylinder(5.0,2.0);
        System.out.println("radius is :" + C2.getRadius()+
                ","+"Height is:"+C2.getHeight()+
                ","+"Area is:"+C2.getArea()+
                ","+"volume is:"+C2.getVolume());
    }
}
