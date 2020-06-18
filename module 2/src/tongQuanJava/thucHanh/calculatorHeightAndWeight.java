package tongQuanJava.thucHanh;
import java.util.Scanner;

public class calculatorHeightAndWeight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your weight (in kilogram) :");
        double weight =scanner.nextDouble();
        System.out.println("Enter your height(in metter) :");
        double height=scanner.nextDouble();


        double bmi=weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Interpretation\n");

        if (bmi<18.5){
            System.out.printf("%-20s%s",bmi,"Underweight");
        }
        else if(bmi<25.0){
            System.out.printf("%-20s%s",bmi,"Normal");

        }
        else if(bmi<30.0){
            System.out.printf("%-20s%s",bmi,"Overweight");
        }
        else {
            System.out.printf("%-20s%s",bmi,"Obese");
        }


    }
}
