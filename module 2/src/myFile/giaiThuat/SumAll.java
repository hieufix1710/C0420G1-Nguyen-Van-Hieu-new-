package myFile.giaiThuat;


import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount element in array :");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Enter elenment number " + (i + 1));
            int element = scanner.nextInt();
            array[i] = element;
            i++;
        }
        System.out.println("Array before check :");
        for (int a : array
        ) {

            System.out.print(a + " ");

        }
        System.out.println();
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                sum += array[j];
            }
        }
        System.out.print("Sum of element cheked  here: " + sum);

    }
}
