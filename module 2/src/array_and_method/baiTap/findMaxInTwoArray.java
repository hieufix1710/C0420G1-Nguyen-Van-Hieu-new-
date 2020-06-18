package array_and_method.baiTap;

import java.util.Scanner;

public class findMaxInTwoArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter element of array big");
        int numb=scanner.nextInt();
        System.out.println("Enter element of array small");
        int numb2=scanner.nextInt();
        int [][] array = new int[numb][numb2];
        for (int row=0;row<array.length;row++){
            for (int cols=0;cols<array[row].length;cols++){
                System.out.println("Enter element row :"+ row+ "\n"+"Enter element cols :"+cols);             // input element
                array[row][cols]=scanner.nextInt();
            }

        }
        int max=array[0][0];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){

                if (array[i][j]>=max){
                    max=array[i][j];


                }

            }
        }
        System.out.println("Elemen has value max is :" + max);





    }
}
