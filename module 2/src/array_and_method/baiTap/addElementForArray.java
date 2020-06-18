package array_and_method.baiTap;

import java.util.Scanner;

class addElementForArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array={1,5,4,2,0,0,0,0,0,0};


        int count;
        System.out.println("Enter location in array you want to push element");
        count=scanner.nextInt();
        for (int i=0;i<array.length;i++){

            if ((i+1)==count){
                System.out.println("Enter element need push");
                int X=scanner.nextInt();
                array[i]=X;
            }
        }
        System.out.print("Array after push element :");
        for (int a:array
             ) {

            System.out.print(a +" ");

        }
    }
}
