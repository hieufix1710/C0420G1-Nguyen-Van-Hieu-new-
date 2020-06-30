package input_output_text.thuc_hanh.bai3_sumofallnumber;

import java.io.*;

public class SumNumber {
    public static String PATH = "src/input_output_text/thuc_hanh/bai3_sumofallnumber/number";

    public static void main(String[] args) {
        File file = new File(PATH);
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            StringBuffer result = new StringBuffer();
            String line;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    sum += Integer.parseInt(line);
                } catch (Exception e) {
                    System.out.println("Error ! Noi dung co loi !");
                }

            }
            System.out.println("Tong : "+sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
