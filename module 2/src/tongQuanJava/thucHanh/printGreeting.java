package tongQuanJava.thucHanh;

import java.util.Scanner;

public class printGreeting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name= scanner.next();
        System.out.println("Hello : "+name);
    }
}
