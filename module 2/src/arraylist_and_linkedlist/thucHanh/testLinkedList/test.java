package arraylist_and_linkedlist.thucHanh.testLinkedList;

public class test {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student(int i, String name) {
                this.name = name;
            }
            public String getName(){
                return this.name;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }



        MyLinkedList<Integer> myLinkedList=new MyLinkedList<>();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
       for (int i=0;i<myLinkedList.getSize();i++){
           System.out.println(myLinkedList.get(i));
       }


       MyLinkedList <Student> myLinkedList2=new MyLinkedList<>();
       Student student=new Student(1,"Hai");
       Student student1=new Student(1,"Hai");

       myLinkedList2.addFirst(student);
       myLinkedList2.addFirst(student1);
       for (int i=0;i<myLinkedList2.getSize();i++){
           System.out.println(myLinkedList2.get(i));
       }


    }
}
