package class_and_OOP.baiTap;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle() {

    }
    public Circle(double radius) {
         this.radius=radius;
    }





    public String getColor(){
        return this.color;
    }
    public void  setColor(String color){
         this.color=color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        final double PI = 3.14;
        double Area = Math.pow(radius, 2) * PI;
        return Area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
