package stack_and_queue.baiTap.useStack.bai1;

import java.util.*;

public class Employee implements Comparable {
    private String gender;
    private String name;
    private String birthday;

    public Employee(String name, String gender, String birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getGender() {
        return gender;
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        return this.gender.compareTo(employee.getGender());
    }

    public static void main(String[] args) {
//        List<Employee> employees = new ArrayList<Employee>();
//        employees.add(new Employee("hieu", "Male", 10));
//        employees.add(new Employee("hieu1", "FeMale", 10));
//        employees.add(new Employee("hieu2", "Male", 10));
//        employees.add(new Employee("hieu3", "FeMale", 10));
//        employees.add(new Employee("hieu4", "Male", 10));
//        Collections.sort(employees);
//
//        for (Employee ep:employees) {
//            System.out.println(ep.toString());
//        }



        Queue<Employee> male = new LinkedList<>();
       Queue<Employee> female = new LinkedList<>();
       int size = 5;
        Employee[] students = new Employee[size];

        students[0] = new Employee("Huy", "Male", "23/05/1990");
        students[1] = new Employee("Duong", "Male", "21/02/1990");
        students[2] = new Employee("Nhung", "Female", "13/04/1990");
        students[3] = new Employee("Minh", "Male", "25/12/1990");
        students[4] = new Employee("Linh", "Female", "19/05/1990");
        for (int i = 0; i < size; i++) {
            if (students[i].getGender().equals("Male")) {
                male.add(students[i]);
            } else if (students[i].getGender().equals("Female")) {
                female.add(students[i]);
            }
        }
        while (!female.isEmpty()) {
            System.out.println(female.remove().toString());
        }
        while (!male.isEmpty()) {
            System.out.println(male.remove().toString());
        }
    }


    }



