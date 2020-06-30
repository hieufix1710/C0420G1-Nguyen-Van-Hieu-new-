package debug_and_exeption.thuc_hanh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LinearEquationResolver extends Throwable {
    public static void main(String[] args) {
        boolean check = true;
        while (check) {

            System.out.println("Linear Equation Resolver");
            System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("a: ");
                double a = scanner.nextDouble();

                System.out.print("b: ");
                double b = scanner.nextDouble();

                if (a != 0) {
                    double solution = -b / a;
                    System.out.printf("The solution is: %f!", solution);
                } else {
                    if (b == 0) {
                        System.out.print("The solution is all x!");
                    } else {
                        System.out.print("No solution!");
                    }
                }
                check = false;
            } catch (ArithmeticException e) {
                System.out.println("Exception detected !");
                check = true;
            } catch (InputMismatchException e) {
                System.out.println("Input number not valid ! Check again !");
                check = true;
            }
        }
    }
}