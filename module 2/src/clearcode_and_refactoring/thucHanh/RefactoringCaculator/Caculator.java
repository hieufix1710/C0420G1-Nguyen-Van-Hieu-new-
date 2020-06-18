package clearcode_and_refactoring.thucHanh.RefactoringCaculator;

import java.util.Scanner;

class Calculator {
    public static final char ADDTION='+';
    public static final char SUBTRACTION ='-';
    public static final char MULTIPLICATION ='*';
    public static final char DIVISION ='/';
    public static double result=0;
    public static double calculate(double firstOperand, double secondOperand, char operator) {

        switch (operator) {
            case ADDTION:
                return result=firstOperand + secondOperand;
            case SUBTRACTION:
                return result=firstOperand - secondOperand;
            case MULTIPLICATION:
                return result=firstOperand * secondOperand;
            case DIVISION   :
                if (secondOperand != 0)
                    return result= firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first operand:");
        double firstOperand=scanner.nextInt();

        System.out.println("Enter second operand:");
        double secondOperand=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter operator :");
        char operator = scanner.nextLine().charAt(0);

        calculate(firstOperand,secondOperand,operator);
        System.out.println(result);


    }
}