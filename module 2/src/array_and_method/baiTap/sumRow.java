package array_and_method.baiTap;

import java.util.Scanner;

public class sumRow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number amount row :");
        int numb=scanner.nextInt();
        System.out.println("Enter number amount cols :");
        int numb2=scanner.nextInt();
        int[][] array=new int[numb][numb2];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                System.out.println("Enter value element in row :"+i+"\n"+"Enter value element in cols :"+ j);
                array[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter row you want to check sum :");
        int choice=scanner.nextInt();
        int sum=0;
        for (int i=0;i<array.length;i++) {
            if (choice==i){
                for (int j = 0; j < array[i].length; j++) {
                    sum+=array[i][j];
                }

            }

        }
        System.out.println("Value you finding is :"+sum);

    }
}
