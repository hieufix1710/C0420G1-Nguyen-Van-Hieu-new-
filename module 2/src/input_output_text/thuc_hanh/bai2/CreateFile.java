package input_output_text.thuc_hanh.bai2;

import sun.security.krb5.SCDynamicStoreConfig;

import java.io.*;
import java.nio.file.Watchable;
import java.util.Scanner;

public class CreateFile {
    public static String PATH="src/input_output_text/thuc_hanh/bai2";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your text :");
        String str=scanner.nextLine();
        File file=new File(PATH,"text.txt");
        try {
            FileWriter writer=new FileWriter(file);
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader reader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            StringBuffer result= new StringBuffer();
            String line;
            while ((line=bufferedReader.readLine())!=null){
                result.append(line);
            }
            System.out.println(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
