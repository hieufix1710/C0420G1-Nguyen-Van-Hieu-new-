package collection_framework.thuc_hanh.bai2_collecttions.build_hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MyHashMap {
    static class Student{
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
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
    public static void main(String[] args) {
        HashMap<Integer,Object> hashMap=new HashMap<>();
        Student student1=new Student(1,"Hai");
        Student student2=new Student(2,"Hieu");
        Student student3=new Student(3,"Vu");

        HashMap<Integer,Object> hashMap1=new HashMap<>();
        hashMap1.put(1,student1);
        hashMap1.put(2,student2);
        hashMap1.put(3,student3);


        // print Object here!
        Set<Integer> keys = hashMap1.keySet();
        for (Integer key : keys) {
            System.out.println("Key: " + key + ".	" + hashMap1.get(key));
        }


    }
}
