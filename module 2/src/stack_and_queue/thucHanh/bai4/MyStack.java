package stack_and_queue.thucHanh.bai4;

public class MyStack {
    public int arr[];
    public int size;
    public int index;



    public MyStack(int size) {
        this.size = size;
        arr=new int[size];

    }

    public void push(int element) {

         if (isFull()) {

         }
         else {
             arr[index] = element;
             index++;
         }

    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public int getSize() {
        return index;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;

    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;


    }

    public static void main(String[] as) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.getSize());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.getSize());
    }
}
