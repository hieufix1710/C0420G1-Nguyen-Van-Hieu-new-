package collection_framework.thuc_hanh.bai2_collecttions.build_linked_hashmap;

import java.util.LinkedHashMap;
import java.util.Set;

public class MyLinkedHashMap {
    static class Student {
        private String name;
        private int age;
        private String address;

        public Student() {
        }

        public Student(String name, int age, String address) {
            super();
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Student@name=" + name + ",age=" + age + ",address=" + address;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Cong", 17, "Hanoi");
        Student student2 = new Student("Dung", 16, "Haiphong");
        Student student3 = new Student("Ngon", 18, "Hanoi");
        Student student4 = new Student("Hanh", 19, "Danang");
        LinkedHashMap<Integer,Object> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(1,student1);
        linkedHashMap.put(2,student2);
        linkedHashMap.put(3,student3);
        linkedHashMap.put(4,student4);

        Set<Integer> set=linkedHashMap.keySet();
        for (int a:set) {
            System.out.println("Key "+a+" "+linkedHashMap.get(a));
        }

    }
}
