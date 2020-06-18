package array_and_method.baiTap;

import java.util.Scanner;

public class linkArray {
    public static void main(String[] args) {
        int[] array1={0,0,0,0,0};
        int[] array2={0,0,0,0,0};
        int[] array3={0,0,0,0,0,0,0,0,0,0};
        Scanner scanner=new Scanner(System.in);
        int count=0;
        System.out.println("Enter element from array :");
        for (int i=0;i<array1.length;i++){
            if (array1[i]==count){
                System.out.println("Enter element number "+(i+1)+" :");   //add element array 1
                array1[i]=scanner.nextInt();
            }
        }
        System.out.println("Enter element array from array 2 :");
        for (int i=0;i<array1.length;i++){
            if (array2[i]==count){                                        // add element array 2
                System.out.println("Enter element number "+(i+1)+" :");
                array2[i]=scanner.nextInt();
            }
        }

        int count3=0;
        for (int k=0;k<array1.length;k++){
            while (count3<array1.length) {
                for (int i = 0; i < array1.length; i++) {
                    array3[count3] = array1[i];
                    count3++;
                }
            }


        }
        int count4=5;
        for (int k=0;k<array2.length;k++){
            while (count4<10) {
                for (int j = 0; j < array2.length; j++) {
                    array3[count4] = array2[j];
                    count4++;
                }
            }
        }
        System.out.println("Array after pushed");
        for (int i=0;i<array3.length;i++){
            System.out.print(array3[i]+" ");
        }


    }

}
