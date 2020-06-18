package loop_statement.thucHanh;

import java.util.Scanner;

public class checkNumberPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number want to check");
        int number=scanner.nextInt();
        if (number<2){
            System.out.println("This number is not a prime");
        }
        else {
            int i=2;
            boolean check=true;
            while (i<=Math.sqrt(number)){
                if (number%i==0){
                    check = false;
                }
                i++;
            }
            if(check){
                System.out.println(number + " is a prime");
            }else {
                System.out.println(number + " is not a prime");
            }
        }


    }
}
