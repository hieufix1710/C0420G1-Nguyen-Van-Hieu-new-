package stack_and_queue.baiTap.build_queue;


public class MyQueue<E> {

    private Object queueArr[];
    private int currentSize=0;
    private int capacity;
    class Node{
        private int data;
        private Node link;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

    }

    public MyQueue(int capacity) {
        this.capacity = capacity;

        queueArr= new Object[capacity];
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "front=" + front.data +
                ", rear=" + rear.data +
                '}';
    }

    private Node front;
    private Node rear;
    public boolean isFull(){
        boolean status= false;
        if (currentSize==capacity){
            status=true;
        }
        return status=false;
    }
    public boolean isEmpty(){
        boolean status =false;
        if (currentSize==0){
            status=true;
        }
        return status;
    }
    public void enQueue(int element){
        Node newNote = new Node(element);
        if (isFull()){
            System.out.println("Failed ! Unable push");
        }
        if (isEmpty()){
            front=rear=newNote;
            queueArr[0]=newNote;
            currentSize++;
        }else {
            queueArr[currentSize]=newNote;
            rear.link=newNote;
            rear=newNote;
            currentSize++;
        }
    }
    public int deQueue(){
        if (isEmpty()){
            System.out.println("Not have element to delete ");
            return -1;
        }
        else {
            Node temp=front;
            front=front.link;
            currentSize--;
            return temp.data;
        }
    }



    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue(5);
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.deQueue();
        while (!myQueue.isEmpty()){
            System.out.println(myQueue.toString());
        }

    }

}
