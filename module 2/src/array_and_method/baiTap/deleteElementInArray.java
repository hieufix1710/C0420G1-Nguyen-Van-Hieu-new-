package array_and_method.baiTap;

import java.util.Arrays;
import java.util.Scanner;

public class deleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array ={1,5,4,2,6,7,9,8,3,0};
        System.out.println("Array before delete element");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Enter element need delete");
        int X=scanner.nextInt();
        for (int i=0;i<array.length;i++){
            if (X==array[i]){
                for (int j=0;j<array.length-1;j++){              //Point of delete element
                    array[i]=array[j+1];

                }
            }
        }
        System.out.print("Property list: ");
        System.out.println(Arrays.toString(array));

    }
}