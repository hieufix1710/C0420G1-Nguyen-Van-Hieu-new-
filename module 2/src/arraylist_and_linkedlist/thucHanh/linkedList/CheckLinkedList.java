package arraylist_and_linkedlist.thucHanh.linkedList;

public class CheckLinkedList {
    public static void main(String[] args) {
//        MyLinkedList<Integer> num=new MyLinkedList<>();
//        num.addFirst(1);
//        num.addFirst(2);
//        num.addFirst(3);
//        num.add(5,2);
//        num.addLast(33);
//        num.add(3,9);
//        num.clear();
//        for (int i = 0; i <num.getSize() ; i++) {
//            System.out.println(num.get(i));
//        }
        class Student{
            private int id;
            private String name;

            public Student(int id,String name) {
                this.name = name;
                this.id=id;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return id+"."+name;
            }
        }
        MyLinkedList<Student> student=new MyLinkedList<>();

        Student student1=new Student(1,"Nguyen");
        Student student2=new Student(2,"Van");
        Student student3=new Student(3,"Hieu");
        student.addFirst(student1);
        student.addLast(student2);
        student.addLast(student3);
        student.remove(2);
        for (int i = 0; i <student.getSize(); i++) {
            System.out.println(student.get(i));

        }

    }


}
