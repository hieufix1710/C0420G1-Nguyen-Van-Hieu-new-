package abtract_and_interface.thucHanh.bai4;


public class Square extends Shape implements Colorable {
    double width;

    double side;
    double height;

    public Square() {

    }

    public Square(double width, double height, double side) {
        this.width = width;
        this.height = height;
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}
