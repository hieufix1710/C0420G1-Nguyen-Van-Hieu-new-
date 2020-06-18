package arraylist_and_linkedlist.baiTap.bai1;

public class MyLinkedList<E> {
    class Node{
       private Node next;
       private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    private Node head;
    private int numNodes=0;

    public void addFirst(E element){
        Node temp=head;
        head=new Node(element);
        head.next=temp;
        numNodes++;
    }

    public MyLinkedList() {
    }

    public void addLast(E element){
        Node temp=head;
        for (int i = 0; i <numNodes&&temp.next!=null; i++) {
            temp=temp.next;
        }
        temp.next=new Node(element);
        numNodes++;
    }
    public void add(int index,E element){
        Node temp=head;
        Node holder;
        for (int i = 0; i <index-1&&temp.next!=null ; i++) {
            temp=temp.next;

        }
        holder=temp.next;
        temp.next=new Node(element);
        temp.next.next=holder;
        numNodes++;
    }
    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("index : " + index);
        }
        Node temp = head;
        Object data;
        if (numNodes == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;

        }
        return (E) data;
    }
    public int getSize(){
        return numNodes;
    }
    public Object get(int index){
        Node temp=head;
        for (int i = 0; i <index ; i++) {
            temp=temp.next;

        }
        return temp.data;
    }


}
