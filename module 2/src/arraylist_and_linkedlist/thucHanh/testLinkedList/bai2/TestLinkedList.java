package arraylist_and_linkedlist.thucHanh.testLinkedList.bai2;

import java.util.Scanner;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }
        }
        LinkedList<Student> linkedList = new LinkedList<Student>();
//        Student student1=new Student(1,"Anh");
//        Student student2=new Student(2,"Hai");
//        Student student3=new Student(3,"Hieu");
//        Student student4=new Student(4,"Minh");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data first run :");
        int check = 0;
        System.out.println("Enter check other 1 to continue input data of student from list?");
        check = scanner.nextInt();


        while (check == 1) {


            System.out.println("Enter id of student :");
            Student student = new Student();
            student.id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter name of student :");
            student.name = scanner.nextLine();
            linkedList.addFirst(student);

            System.out.println("Enter check?");
            check = scanner.nextInt();


        }
        System.out.print("1.Display list student");


        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.println("List student :");
                for (int i = 0; i < linkedList.getSize(); i++) {
                    linkedList.getIndex(i);
                    System.out.println((i + 1) + "." + ((Student) linkedList.getIndex(i)).name);
                }




        }


    }
}
