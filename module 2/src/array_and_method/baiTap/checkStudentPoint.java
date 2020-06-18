package array_and_method.baiTap;

import java.util.Scanner;

public class checkStudentPoint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter size of array :");
            size=scanner.nextInt();
            if (size>30)
                System.out.println("Size should not exeed 30");
        } while (size>30);
        array =new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter a mark for student "+(i+1)+ " :");
            array[i]=scanner.nextInt();
            i++;
        }
        int count=0;
        System.out.println("Lisr of mark :");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
            if (array[j]>=5 &&array[j]<=10)
                count++;

        }
        System.out.println();
        System.out.println("The number of student passing the exame is :"+count);
    }
}
