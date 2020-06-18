package array_and_method.thucHanh;

import java.util.Scanner;

public class findMaxInArray {
    public static void main(String[] args) {
        int[] array;
        int count =0;
        int size;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter a size ?");
            size=scanner.nextInt();
            if (size>20){
                System.out.println("Size should not excceed 20 ");
            }
        }while (size>20);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter element "+(i+1)+":");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("Propety list :");
        for (int j=0;i<array.length;j++){
            System.out.print(array[j]+"\t");
        }
        int max=array[0];
        int index=1;
        for ( int j=0;j<array.length;j++){
            if (array[j]>max){
                max=array[j];
                index=j+1;
            }
        }
        System.out.println("The lasget property value in the list is "+ max+" ,at position "+ index);
    }
}
