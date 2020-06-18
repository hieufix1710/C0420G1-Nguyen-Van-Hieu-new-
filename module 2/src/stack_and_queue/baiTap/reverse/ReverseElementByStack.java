package stack_and_queue.baiTap.reverse;


import java.util.Stack;

public class ReverseElementByStack<T> {


    public static void main(String[] args) {
        int[] array_1 = {1, 2, 3, 4, 5};
        for (int i : array_1) {
            System.out.print(i + " ");

        }
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = stack.pop();
        }
        System.out.println();
        for (int i : array2) {
            System.out.print(i + " ");

        }

    }


}