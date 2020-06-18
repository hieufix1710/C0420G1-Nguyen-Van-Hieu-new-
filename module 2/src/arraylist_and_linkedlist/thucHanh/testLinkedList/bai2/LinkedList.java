package arraylist_and_linkedlist.thucHanh.testLinkedList.bai2;

public class LinkedList<E> {
    class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
    private Node head;
    private int count=0;
    public void addFirst(E element){
        Node temp=head;
        head=new Node(element);
        head.next=temp;
        count++;
    }
    public void addLast(E element){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(element);

    }
    public void add(int index,E element){
        Node temp=head;
        Node holder;
        for (int i=0;i<index-1&&temp.next!=null;i++){
            temp=temp.next;
        }
        holder=temp.next;
        temp.next=new Node(element);
        temp.next.next=holder;
        count++;
    }
    public Object getIndex(int index){
        Node temp=head;
        for (int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public int getSize(){
        return count;
    }


}
