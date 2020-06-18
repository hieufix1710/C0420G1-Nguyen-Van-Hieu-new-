package array_and_method.thucHanh;

import java.util.Scanner;

public class findingElementInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] students={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean isExist=false;
        System.out.println("Enter name of students want to finding ?");
        String inputName=scanner.nextLine();
        for (int i=0;i<students.length;i++){
            if (students[i].equals(inputName)){
                System.out.println("Position of the students in the list "+ inputName+" is "+(i+1));
                isExist=true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found "+ inputName+" in the list  -_- ");
        }
    }
}
