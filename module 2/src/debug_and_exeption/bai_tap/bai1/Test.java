package debug_and_exeption.bai_tap.bai1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a :");
        double side_a = scanner.nextDouble();
        System.out.println("Enter b");
        double side_b = scanner.nextDouble();
        System.out.println("Enter b");
        double side_c = scanner.nextDouble();

        try {
            Triangle triangle=new Triangle(side_a,side_b,side_c);
            System.out.println(triangle);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }


    }
}
