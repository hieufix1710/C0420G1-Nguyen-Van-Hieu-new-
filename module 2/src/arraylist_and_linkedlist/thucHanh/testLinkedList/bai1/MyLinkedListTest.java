package arraylist_and_linkedlist.thucHanh.testLinkedList.bai1;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student(int id,String name) {
                this.id=id;
                this.name=name;
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
        class Teacher{
            private int id;
            private String name;

            public Teacher(int id, String name) {
                this.id = id;
                this.name = name;
            }
            public String getName(){
                return  this.name;
            }

            @Override
            public String toString() {
                return "Teacher{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
        MyLinkedList linkedList=new MyLinkedList();
        Student student1=new Student(1,"John");
        linkedList.addFirst(student1);
        Teacher teacher1=new Teacher(2,"Jack");
        linkedList.addLast(teacher1);


        for (int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i).toString()
            );
        }
        System.out.println(linkedList.indexOf("John"));
    }
}
