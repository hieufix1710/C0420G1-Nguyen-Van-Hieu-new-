package myFile.giaiThuat;

import java.util.Scanner;

public class Caculator {


    public static void main(String[] args) {
        System.out.println("Enter amount number need check ?");
        Scanner scanner=new Scanner(System.in);
        double sum=0;
        double num=scanner.nextInt();

            for (double i=1;i<=num;i++){
                sum+=1/i;
            }


        System.out.println("Result of you :"+  sum);
    }
}
