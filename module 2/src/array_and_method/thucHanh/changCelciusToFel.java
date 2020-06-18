package array_and_method.thucHanh;

import java.util.Scanner;

public class changCelciusToFel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double fahrenheit,celcius;
        int choice = 0;
        System.out.println("Menu");
        System.out.println("1.Change celcius to fahrenheit");
        System.out.println("2.Change fahrenheit to cencius");
        System.out.println("0.Exit");
        switch (choice){
            case 1:
                System.out.println("Enter celcius");
                celcius=scanner.nextDouble();
                celciusToFahrenheit(celcius);
            case 2:
                System.out.println("Enter fahrenheit");
                fahrenheit=scanner.nextDouble();
                fahrenheitToCelcius(fahrenheit);

        }
    }

    public static double celciusToFahrenheit(double celcius){
        double fahrenheit=(9.0/5)*celcius+32;
        return fahrenheit;
    }
    public static double fahrenheitToCelcius(double fahrenheit){
        double celcius=(5.0/9)*(fahrenheit-32);
        return  celcius;
    }
}
