package Inheritance;

public class Circle {
    private double radius;
    private String color;
    public Circle(){
        this.radius=2.0;
        this.color="red";
    }
    public Circle(double radius){
    this.radius = radius;
    this.color=color;
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    Double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
   public void setColor(String color){
       this.color = color;
   }
    public String toString() {
        return "Inheritance.Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    public double getArea(){
        return radius * radius *Math.PI;
    }
}
