package tongQuanJava.thucHanh.bai5;
import java.util.Scanner;

public class caculatorDayInMonth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Which month that you want to count days ?");
        int month= scanner.nextInt();
        String daysInMonth;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                daysInMonth ="31";
                break;
            case 2:
               daysInMonth = "28 or 29";
                break;
            case 4:
            case 6:
            case 8:
            case 12:
               daysInMonth ="30";
                break;
            default:
               daysInMonth ="";
               break;
        }

        if (daysInMonth!=""){
            System.out.printf("The month '%d' has '%s' day !",month,daysInMonth);
        }
        else {
            System.out.print("Invalid Input");
        }
    }
}
