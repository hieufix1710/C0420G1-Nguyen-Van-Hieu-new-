package debug_and_exeption.thuc_hanh.bai2;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static Integer[] createRandom(){
        Random random=new Random();
        Integer[] arr=new Integer[100];
        System.out.println("Danh sach ca phan tu cua mang :");
        for (int i = 0; i <100 ; i++) {
              arr[i]=random.nextInt();
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        return arr;

    }

    public static void main(String[] args) {
       ArrayExample arrayExample=new ArrayExample();
       Integer[] arr=arrayExample.createRandom();
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter random number :");
        int x=scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("chi so vuot qua gioi han cua mang");
        }

    }
}
