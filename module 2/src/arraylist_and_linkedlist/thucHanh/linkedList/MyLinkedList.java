package arraylist_and_linkedlist.thucHanh.linkedList;

public class MyLinkedList<E> {
    class Node {
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
    private int numNodes;

    public MyLinkedList() {
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
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

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
            if (temp.getData().equals(element)) {
                return i;
            }

        }
        return -1;

    }

    public int size() {
        return this.numNodes;
    }

    public boolean remove(Object e) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
            holder = temp.next;
            if (temp.data.equals(e)) {
                temp.next.next.data = holder;
                return true;
            } else {
                return false;
            }

        }
        return false;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        return temp.data;
    }

    public Object getFirst() {
        if (numNodes == 0) {
            return null;
        } else {
            return head.data;
        }
    }

    public Object getLast() {
        Node temp = head;
        if (numNodes == 0) {
            return null;
        } else {
            for (int i = 0; i < numNodes; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public void clear() {
        Node temp = head;
        head = null;
        for (int i = 0; i < numNodes; i++) {
            temp.next = null;
        }
        numNodes = 0;
        System.out.println("No element in linked list ");
    }

    public int getSize() {
        return numNodes;
    }

    public boolean contains(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes && temp.next != null; i++) {
            if (temp.getData().equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        if (numNodes == 0) {
            throw new IllegalArgumentException("numNode : " + numNodes);
        } else {
            MyLinkedList<E> returnMyLinkedList = new MyLinkedList<>();
            Node temp = head;
            returnMyLinkedList.addFirst((E) temp.data);
            temp = temp.next;
            while (temp != null) {
                returnMyLinkedList.addLast((E) temp.data);
                temp = temp.next;
            }
            return returnMyLinkedList;
        }

    }

}
