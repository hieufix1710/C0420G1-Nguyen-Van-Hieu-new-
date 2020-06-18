package stack_and_queue.baiTap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string need check :");
        String str = scanner.nextLine();

        char[] ch = new char[str.length()];
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length() / 2; i++) {
            ch[i] = str.charAt(i);
            stack.push(ch[i]);
        }
        Queue<Character> queue2 = new LinkedList<>();
        for (int i = str.length() / 2; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            queue2.add(ch[i]);
        }
//        while (!stack.isEmpty()){
//            System.out.print(stack.pop()+" ");
//        }
//        System.out.println("----------------------------------");
//
//        while (!queue2.isEmpty()){
//            System.out.print(queue2.poll()+" ");
//        }

        boolean status = false;
        int temp = stack.size();
        while (!stack.isEmpty()) {

            if (stack.pop() == queue2.poll()) {
                status = true;
                temp--;


            } else {
                temp++;
            }


        }
        if (temp == 0) {
            System.out.println("This is a Palindrome :D");
        } else {
            System.out.println("This is not a Palindrome :(");
        }


    }
}
