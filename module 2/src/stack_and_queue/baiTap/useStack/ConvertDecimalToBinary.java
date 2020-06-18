package stack_and_queue.baiTap.useStack;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        System.out.println("Enter choose of you ?");
        System.out.println("1.Convert decimal to binary " + "\n" + "2.Convert binary to decimal " + "\n" + "3.Convert decimal to" +
                " hexadecimal "
                + "\n" + "4.Convert hexadecimal to decimal " + "\n");
        choose=scanner.nextInt();
        switch (choose) {
            case 1:
                Stack<Integer> stack = new Stack<>();
                int decimal;
                System.out.println("Enter decimal number :");
                decimal = scanner.nextInt();
                while (decimal != 0) {
                    int result1 = (decimal % 2);
                    stack.push(result1);
                    decimal /= 2;
                }
                System.out.println("Here is decimal after convert to binary");
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                break;
            case 2:
                Stack<Integer> stack2 = new Stack<>();
                System.out.println("Enter binary number :");
                int binary;
                int result2 = 0;
                int n = 0;
                binary = scanner.nextInt();
                while (binary != 0) {
                    int temp = binary % 10;
                    result2 += temp * Math.pow(2, n);
                    binary = binary / 10;
                    n++;

                }
                stack2.push(result2);
                System.out.println("Here is binary after convert to decimal :");
                while (!stack2.isEmpty()) {
                    System.out.println(stack2.pop());
                }
                break;
            case 3:
                Stack<String> stack1 = new Stack<>();
                System.out.println("Enter decimal number :");
                int decimal1 = scanner.nextInt();
                int temp;
                String str = "";
                char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                while (decimal1 > 0) {
                    temp = decimal1 % 16;
                    str = hex[temp] + str;
                    decimal = decimal1 / 16;
                }
                stack1.push(str);
                while (!stack1.isEmpty()) {
                    System.out.println(stack1.pop());
                }
                break;
            case 4:
                Stack<Integer> stack4=new Stack<>();
                System.out.println("Enter hexadecimal number :");
                scanner.nextLine();
                String hexa=scanner.nextLine();
                String digits = "0123456789ABCDEF";
                hexa = hexa.toUpperCase();
                int val = 0;
                for (int i = 0; i < hexa.length(); i++)
                {
                    char c = hexa.charAt(i);
                    int d = digits.indexOf(c);
                    val = 16*val + d;
                }
                stack4.push(val);
                System.out.println("Decimal number after convert from hexadecimal number :");
                while (!stack4.isEmpty()){
                    System.out.println(stack4.pop());
                }







        }

    }

}
