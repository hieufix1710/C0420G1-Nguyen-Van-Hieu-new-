package class_and_OOP.thucHanh.testAccessModify;

public class TestStaticPropety {
    public static void main(String[] args) {
        Car car1=new Car("Mazda 3","Skyactive 3");
        System.out.println(Car.numberOfCar);
        Car car2=new Car("Mazda 6","Skyactive 6");
        System.out.println(Car.numberOfCar);
    }
}
