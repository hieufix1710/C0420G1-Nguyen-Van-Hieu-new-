package tongQuanJava.thucHanh;
import java.util.Scanner;
public class checkLeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter year you want to check :");
        int year = scanner.nextInt();
        boolean isLeapYear =false;
        if (year%4==0){
            if (year%100==0){
                if(year%400==0){
                   isLeapYear=true;
                }
                else {
                   isLeapYear=false;
                }
            }else {
                isLeapYear=true;
            }
        }
        else {
           isLeapYear=false;
        }
        if (isLeapYear){
            System.out.printf("%d is leap year",year);
        }
        else {
            System.out.printf("%d is not leap year",year);
        }
    }

}
