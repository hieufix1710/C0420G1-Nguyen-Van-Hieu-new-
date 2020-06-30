package input_output_binary.thuc_hanh.bai2;

import java.io.*;

public class IOStream {
    public static String PATH="src/input_output_binary/thuc_hanh/bai2/text.txt";
    public static void main(String[] args) throws FileNotFoundException {
       FileOutputStream file=null;
       FilterOutputStream filter=null;

       try {
           file=new FileOutputStream(new File(PATH));
          filter=new FilterOutputStream(file);
          filter.write(888);
           System.out.println("success...");
          filter.flush();
          file.close();
          filter.close();

       }catch (Exception e){
           System.out.println(e);
       }


    }
}
