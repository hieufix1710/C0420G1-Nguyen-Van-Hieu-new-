package abtract_and_interface.thucHanh.bai2;



import class_and_OOP.baiTap.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle circle1, Circle circle2) {
        if (circle1.getRadius() > circle2.getRadius()) return 1;
        else if (circle1.getRadius() < circle2.getRadius()) return -1;
        else return 0;
    }
}