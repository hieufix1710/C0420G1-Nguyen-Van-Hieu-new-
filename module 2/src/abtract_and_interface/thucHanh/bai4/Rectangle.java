package abtract_and_interface.thucHanh.bai4;

public class Rectangle extends Shape {
    double height;
    double width;


    protected Rectangle() {

    }

    public Rectangle(double width, double height,String color,boolean fill) {
        super(color, fill);
        this.width = width;
        this.height = height;



    }


    public double getArea() {
        double Area = this.width * this.height;
        return Area;
    }

    public double getPerimeter() {
        double Perimeter = (this.width + this.height) * 2;
        return Perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +"Area :"+getArea()+
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
