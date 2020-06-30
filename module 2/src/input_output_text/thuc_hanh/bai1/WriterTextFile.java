package input_output_text.thuc_hanh.bai1;


import java.io.*;
import java.util.Scanner;

public class WriterTextFile {
    public static String PATH="src/input_output_text/thuc_hanh/bai1/new/text.txt";
    public static String PATH1="src/input_output_text/thuc_hanh/bai1/new/text1.txt";

    public static void main(String[] args) {
        File file=new File(PATH);
       if (!file.exists()){
           System.out.println("File not exits");

       }else {
           try {
               file.createNewFile();
               System.out.println("File created !");
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
       File file1=new File(PATH1);
        try {

            if (file1.exists()){
                System.out.println("File had exits");
            }else {
                file1.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer=new FileWriter(file);
            writer.write("Hello world !");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader reader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            StringBuffer buffer=new StringBuffer();
            String line;
            while ((line=bufferedReader.readLine())!=null){
                buffer.append(line);
            }
            FileWriter writer=new FileWriter(file1);
            writer.write(String.valueOf(buffer));
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
