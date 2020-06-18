package myFile.test;



import java.util.Scanner;

public class themPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=scanner.nextInt();
        int[] array = new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter value of element "+(i+1)+" :");
            array[i]=scanner.nextInt();
            i++;
        }
        for (int element :array
             ) {
            System.out.print(element+" ");

        }
        System.out.println("Enter location of element need delete ?");
        int count=scanner.nextInt();
        for (int k=0;k<array.length;k++){
            if ((k+1)==count){
                array[k]=0;
            }
        }
        for (int a:array
             ) {
            System.out.print(a+" ");
        }
    }
}
