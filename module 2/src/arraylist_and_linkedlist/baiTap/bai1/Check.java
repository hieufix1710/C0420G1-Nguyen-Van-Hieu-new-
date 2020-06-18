package arraylist_and_linkedlist.baiTap.bai1;

public class Check {
    static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Hai");
        Student student2 = new Student(1, "Hieu");
        Student student3 = new Student(1, "Han");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student3);
        myLinkedList.remove(2);
        for (int i = 0; i < myLinkedList.getSize(); i++) {
            System.out.println(myLinkedList.get(i));

        }
    }
}
