package abtract_and_interface.thucHanh.bai3;

import class_and_OOP.thucHanh.keThua.hinhHoc.Shape;

public class Rectangle extends Shape implements Resizeable {
    double width;
    double height;
    private  double length=1.0;

    public Rectangle() {
        this.width=1.0;
        this.height=1.0;
    }

    public Rectangle(String color, boolean fill, double width, double height) {
        super(color, fill);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double v, double v1) {

    }

    public Rectangle(double v, double v1, String orange, boolean b) {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public  double getArea(){
        double Area=this.width*this.height;
        return Area;
    }
    public  double getPerimeter(){
        double Perimeter=(this.width+this.height)*2;
        return Perimeter;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }

    @Override
    public void resize(double percent) {
       this.width=this.width*percent;
       this.height=this.height*percent;
    }
}
