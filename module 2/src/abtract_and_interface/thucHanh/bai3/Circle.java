package abtract_and_interface.thucHanh.bai3;

public class Circle implements Resizeable {
    private static final double PI = 3.14;

    private double radius = 1.0;
    String color="blue";
    boolean fill=true;

    public Circle() {

    }

    public Circle(double radius,String color,boolean fill) {
        this.radius = radius;
        this.color=color;
        this.fill=fill;

    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean getFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {

        double Area = Math.pow(radius, 2) * PI;
        return Area;
    }

    public double getPerimeter() {
        double Perimeter = 2 * this.radius * PI;
        return Perimeter;
    }

    @Override
    public void resize(double percent) {
         this.radius = this.radius + (this.radius *percent / 100);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", fill=" + fill +
                '}';
    }
}
