package myFile.giaiThuat;

import java.util.Scanner;

public class PrintDay {
    public static void main(String[] args) {
        System.out.println("Enter day need caculator :");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        boolean check = false;

            for (int i = 0; i < day.length() - 1; i++) {
                switch (day.substring(0, 2)) {
                    case "01":
                    case "03":
                    case "05":
                    case "07":
                    case "09":
                    case "11":
                        System.out.println("This month have 31 days");
                        break;
                    case "02":
                        System.out.println("This month day have 28 or 29 days");
                        break;
                    case "04":
                    case "08":
                    case "10":
                    case "12":
                        System.out.println("This month have 30 days");
                        break;
                    default:
                        System.out.print("This month not valid");


                }
            }

    }
}
