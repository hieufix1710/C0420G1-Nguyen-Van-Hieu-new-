package array_and_method.baiTap;

import java.util.Scanner;

public class matrix_ {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter amourt rows");
        int numb=scanner.nextInt();
        System.out.println("Enter amount cols");
        int num2=scanner.nextInt();
        int[][] array=new int[numb][num2];
        for (int i=0;i<numb;i++){
            for (int j=0;j<num2;j++){
                System.out.println("Enter value of element in row "+i+" and cols "+j);
                array[i][j]=scanner.nextInt();
            }
        }
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        int sum=0;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if (i==j){
                    sum+=array[i][j];

                }
            }
        }
        System.out.println("Value of matrix :"+ sum);
    }
}
