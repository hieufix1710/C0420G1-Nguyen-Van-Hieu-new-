package stack_and_queue.thucHanh.bai1;
public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeue item is " + queue.dequeue().key);
    }
}