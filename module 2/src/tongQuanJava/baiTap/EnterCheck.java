package tongQuanJava.baiTap;

import java.util.Scanner;

public class EnterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while (scanner.hasNextLine()) {
            String tempStr = scanner.nextLine();
            if (tempStr.isEmpty()) break;
            str += tempStr + "\n";
        }
        System.out.println("abc");
    }
}
