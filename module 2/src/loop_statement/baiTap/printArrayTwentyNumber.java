package loop_statement.baiTap;

import java.util.Scanner;

public class printArrayTwentyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount number want to display out");
        int number = scanner.nextInt();
        int[] array = new int[number];
        int count = 0;

        while (count < number) {
            System.out.println("Input element number " + count + " :");
            int element = scanner.nextInt();
            array[count] = element;
            count++;
             }


            for (int i = 2; i < array.length; i++) {
                boolean check = true;
                while (2 <= Math.sqrt(array[i])) {
                    if (array[i] % i == 0) {
                        check = false;
                    }
                }
                if (check) {
                    System.out.println(array[i]);
                }
            }


    }
}
