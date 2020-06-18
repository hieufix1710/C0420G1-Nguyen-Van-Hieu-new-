package array_and_method.baiTap;

import java.util.Scanner;

public class checkAmountLoopInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your string");
        String str=scanner.nextLine();
        System.out.println("Enter character your want to check");
        char char1=scanner.nextLine().charAt(0);
        int count=0;
        for (int i=0;i<str.length();i++){
            if (Character.toString(str.charAt(i)).equals(Character.toString(char1))){
                count++;
            }
        }
        System.out.println("Amount loop of charactor in array is "+ count);
    }
}
