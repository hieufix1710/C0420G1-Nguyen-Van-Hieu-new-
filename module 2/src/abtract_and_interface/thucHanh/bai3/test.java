package abtract_and_interface.thucHanh.bai3;

public class test {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println("Circle before resize :");
        System.out.println(circle);
        System.out.println("Circle after resize :");
        circle.resize(50.0);
        System.out.println(circle);

        Rectangle rectangle=new Rectangle();
        System.out.println("Rectangle before resize :");
        System.out.println(rectangle);
        System.out.println("Rectangle after resize :");
        rectangle.resize(50);
        System.out.println(rectangle);

    }
}
