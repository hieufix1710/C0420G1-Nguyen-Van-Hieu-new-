package debug_and_exeption.bai_tap.bai2;

import java.io.IOException;
import java.util.Scanner;

public class TestThrow {
    public static void EnterAgeEmployee() {
       try {
           System.out.println("Enter your age?");
           Scanner scanner=new Scanner(System.in);
           int age=scanner.nextInt();
           if (age<0) throw  new Exception();
       } catch (Exception e) {
           System.out.println("Age not valid");
           e.printStackTrace();
       }

    }
    public static boolean EnterNameEmployee() throws Exception {
        System.out.println("Enter name of employee ?");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int temp=0;
        for (int i = 0; i <name.length() ; i++) {

            if (name.substring(i,i+1)==" "){
                temp++;
            }
            else {
                continue;
            }

        }
        if (temp==2)return true;
        else {
            throw  new Exception();
        }

    }

    public static void main(String[] args) {
//
//            EnterAgeEmployee();
            try {
                EnterNameEmployee();
            } catch (Exception e) {
                System.out.println("Name not valid");
                e.printStackTrace();
            }

    }


}
