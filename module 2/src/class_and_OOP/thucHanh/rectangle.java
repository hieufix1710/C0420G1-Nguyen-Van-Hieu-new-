package class_and_OOP.thucHanh;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle1 = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle1.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle1.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle1.getArea());
    }
    public static class Rectangle {
        double width, height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        public double getArea() {

            return this.width * this.height;
        }

        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }

        public String display() {
            return "Rectangle{" + "width=" + width + ", height=" + height + "}";
        }
    }
}
