package class_and_OOP.thucHanh.keThua;

public class TestTritangle {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;
    double height;

    public TestTritangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }
    //
    public TestTritangle() {

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        double Area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return Area;
    }

    public double getPerimeter() {
        double Premeter = side1 + side2 + side3;
        return Premeter;
    }

    @Override
    public String toString() {
        return "testTritangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ",Area=" + getArea() + ",Premeter=" + getPerimeter() +
                '}';
    }
}
