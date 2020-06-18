package class_and_OOP.thucHanh;

import java.util.Scanner;

public class Person {
    String name;
    int age;


    public Person() {
        this.name=name;
        this.age=age;
    }

    public void sayHi() {
        System.out.println("Hello ! Is me, "+name+" Age : "+ age);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Person person=new Person();
        System.out.println("Enter name :");
        person.name=scanner.nextLine();
        System.out.println("Enter age : ");
        person.age=scanner.nextInt();
        person.sayHi();
    }
}


