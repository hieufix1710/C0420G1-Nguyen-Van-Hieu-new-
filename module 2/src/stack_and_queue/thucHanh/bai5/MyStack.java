package stack_and_queue.thucHanh.bai5;

public class MyStack {
    private int size;
    private int arr[];
    private int index;

    public MyStack(int size) {
        this.size = size;
        arr=new int[size];
    }
   public boolean isEmpty(){
        if (index==0){
            return true;
        }
        return false;
   }
   public boolean isFull(){
        if (index==size){
            return true;
        }
        return false;
   }
   public int size(){
        return index;
   }
   public void push(int element) {
        if (isFull()){
            throw new StackOverflowError("Stack is full");

        }
        else {
            arr[index]=element;
            index++;
        }
   }
   public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is null");

        }
        else {
            return arr[--index];
        }
   }

    public static void main(String[] args) throws Exception {
        MyStack stack=new MyStack(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
        System.out.println("Size of stack after pop :"+stack.size());
    }
}
