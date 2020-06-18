package array_and_method.baiTap;

import java.util.Scanner;

public class findSmallestElementInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=scanner.nextInt();
        int[] array = new int[size];
        for (int i=0;i<array.length;i++){
            System.out.println("Enter value element of array");
            array[i]=scanner.nextInt();
        }
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<=array[0]){
                min=array[i];
            }
        }
        System.out.println("Element has min value is "+min);
    }
}
