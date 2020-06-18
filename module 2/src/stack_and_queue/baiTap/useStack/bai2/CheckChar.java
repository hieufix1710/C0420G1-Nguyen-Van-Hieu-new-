package stack_and_queue.baiTap.useStack.bai2;

import java.util.Scanner;
import java.util.Stack;

public class CheckChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập biểu thức cần kiểm tra :");
        String scn1 = scanner.nextLine();

        Stack<String> stack = new Stack<>();    // Build two stack
        Stack<String> stack1 = new Stack<>();

        for (int i = 0; i < scn1.length(); i++) {
            String character = scn1.substring(i, i + 1);
            if(character.equals("(")){         //add "(" to stack
                stack.push(character);
            }else if (character.equals(")")){
                stack1.push(character);              //add ")" to stack1
            }
        }
        if(stack.size()==stack1.size()){
            System.out.println("Biểu thức đúng");
        }else {                                            // check
            System.out.println("Biểu thức sai");
        }

    }
}
