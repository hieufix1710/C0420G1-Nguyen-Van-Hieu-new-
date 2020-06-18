package loop_statement.thucHanh;

import java.util.Scanner;

public class menuPrintOut {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle ");
        System.out.println("2.Print the square tritangle(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("Exit");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                break;
            case 2:
                System.out.println("Enter height of tritangle");
                int n=scanner.nextInt();
                for (int i=0;i<n;i++){
                    for (int j=0;j<i;j++){
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                System.out.println("-------------------------");
                for (int i=0;i<n;i++){
                    for (int j=n;j>i;j--){
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
            case 3:
                for(int i=7;i>=1;i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
        }
    }
}
