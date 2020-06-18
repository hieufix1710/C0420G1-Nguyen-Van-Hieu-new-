package arraylist_and_linkedlist.thucHanh.testLinkedList;

public class MyLinkedList<E> {
   class Node{
       private Node next;
       private Object data;

       public Node(E element) {
           this.data = element;
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
   public void  addLast(E element){
       Node temp=head;
       while (temp.next!=null){
           temp=temp.next;
       }
       temp.next=new Node(element);
       numNodes++;
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
       numNodes++;
   }
   public Object get(int index){
       Node temp=head;
       for (int i=0;i<index;i++){
           temp=temp.next;
       }
       return temp.data;

   }
   public Object getFirst(){
       if (numNodes==0){
           return null;
       }
       else {
           return  head.data;
       }
   }
   public Object getLast(){
       Node temp=head;
       if (numNodes==0){
           return null;
       }
       else {
           for (int i=0;i<numNodes;i++){
               temp=temp.next;
           }
           return temp.data;
       }
   }
   public void clear(){
       Node temp=head;
       head=null;
       for (int i=0;i<numNodes;i++){
           temp.next=null;
       }
       numNodes=0;
   }
   public int getSize(){
       return numNodes;
   }
   public E remove(int index){
       if(index < 0 || index > numNodes){
           throw new IllegalArgumentException("index : " +index);
       }
       Node temp=head;
       Object data;
       if (index==0){
           data=temp.data;
           head=head.next;
           numNodes--;
       }
       else {
           for (int i=0;i<index-1&&temp.next!=null;i++){
               temp=temp.next;
           }
           data=temp.next.data;
           temp.next=temp.next.next;
       }
       return (E) data;
   }
   public int indexOf(E element){
       Node temp=head;
       for (int i=0;i<numNodes;i++){

           if (temp.getData().equals(element)){
               return i;
           }
           temp= temp.next;
       }
       return -1;

   }

}
