package debug_and_exeption.thuc_hanh.bai3_number_format_exeptio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample extends Exception {
    public void caculator(int x,int y) {
        try {
            int tong=x+y;
            int hieu=x-y;
            int tich=x*y;
            int thuong=x/y;
            System.out.println("Tong :"+tong);
            System.out.println("Hieu :"+hieu);
            System.out.println("Tich :"+tich);
            System.out.println("Thuong :"+thuong);
        }
        catch (ArithmeticException e){
            System.out.println("Xay ra ngoai le :"+ e.getMessage());
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            try{
                System.out.println("Enter x :");
                int x=scanner.nextInt();
                System.out.println("Enter y :");
                int y=scanner.nextInt();
                CalculationExample calculationExample=new CalculationExample();
                calculationExample.caculator(x,y);

            }
            catch (InputMismatchException e){
                System.out.println("Input number not valid !");
            }





    }
}
