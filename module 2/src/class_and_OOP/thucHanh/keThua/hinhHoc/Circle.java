package class_and_OOP.thucHanh.keThua.hinhHoc;

public class Circle extends Shape {
    private static final double PI = 3.14;

    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean fill, double radius) {
        super(color, fill);
        this.radius = radius;
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

    public double getPermeter() {
        double Perimeter = 2 * this.radius * PI;
        return Perimeter;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius() + "which is subclass of :" + super.toString()+getColor();
    }

    public static class CircleTest {
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle);

            Circle circle1 = new Circle(3.5);
            System.out.println(circle1);

            Circle circle2 = new Circle("indigo", false, 3.5);
            System.out.println(circle2);
        }
    }
}
