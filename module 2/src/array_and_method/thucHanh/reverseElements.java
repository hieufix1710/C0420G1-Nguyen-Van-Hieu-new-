package array_and_method.thucHanh;

import java.util.Scanner;

class reverseElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter size of array");
            size=scanner.nextInt();
            if (size>20){
                System.out.println("Size does not exceed 20");
            }
        }while (size>20);
        array =new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter element "+ (i+1)+ ":");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","Element in array :","");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
        System.out.println("\n");
        for (int j=0;j<array.length/2;j++){
                int temp=array[j];
                array[j]=array[size-1-j];           // Reverse array here
                array[size-1-j]=temp;
        }
        System.out.println("Array after reverse :");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }


    }
}
