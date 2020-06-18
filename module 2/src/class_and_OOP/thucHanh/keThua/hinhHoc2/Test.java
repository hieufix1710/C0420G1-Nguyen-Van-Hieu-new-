package class_and_OOP.thucHanh.keThua.hinhHoc2;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(1.2,"red",1.5);
        System.out.println(cylinder);
        Circle circle=new Circle();
        circle.radius=1.2;
        circle.color="blue";
        System.out.println(circle);
    }
}
