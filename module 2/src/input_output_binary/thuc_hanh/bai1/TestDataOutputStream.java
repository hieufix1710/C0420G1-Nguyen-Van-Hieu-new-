package input_output_binary.thuc_hanh.bai1;

import java.io.*;

public class TestDataOutputStream {
    public  static String PATH="src/input_output_binary/thuc_hanh/bai1/";
    public static void main(String[] args) {
       FileOutputStream file=null;
       FilterOutputStream filter=null;

        try {
            file=new FileOutputStream(new File(PATH,"text.txt"));
            filter=new FilterOutputStream(file);
            int s = 65;
            filter.write(s);
            filter.flush();            // xoa het data neu muon truyen dat moi vao ?
            System.out.println("Success...");
            filter.close();
            file.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
