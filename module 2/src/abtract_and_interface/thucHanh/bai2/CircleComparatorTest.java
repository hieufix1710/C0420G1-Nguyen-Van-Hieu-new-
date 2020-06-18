package abtract_and_interface.thucHanh.bai2;

import class_and_OOP.baiTap.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {


    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo");

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle.toString());
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }


    }
}
