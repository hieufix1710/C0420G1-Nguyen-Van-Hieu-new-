package loop_statement.baiTap;

public class displayNumber100 {
    public static void main(String[] args) {
        String count = " ";
        for (int number = 2; number <= 100; number++) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                }
                i++;
            }
            if (check) {
                count += number+" ";
            }
        }
        System.out.println(count);
    }
}
