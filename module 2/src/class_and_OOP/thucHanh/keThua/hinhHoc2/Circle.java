package class_and_OOP.thucHanh.keThua.hinhHoc2;



public class Circle {
   protected double radius;
   protected String color;
   final double PI=3.14;
    public Circle(){

    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPI() {
        return PI;
    }
    public double getArea(){
       double Area=Math.pow(this.radius,2)*PI;
       return Area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", PI=" + PI +
                "Area : "+getArea();
    }
}
