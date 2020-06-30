package input_output_text.bai_tap.bai2;

import java.io.*;
import java.util.ArrayList;


public class ReadFile {
    public static String PATH="src/input_output_text/bai_tap/bai2/";

    public static void main(String[] args) {
        File file=new File(PATH,"csv");
        try {
            FileReader reader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            StringBuffer result=new StringBuffer();
            String line;
            ArrayList<String[]> arrayList=new ArrayList<>();
            while ((line=bufferedReader.readLine())!=null){
                  arrayList.add(line.split(","));

            }
            for (int i = 0; i <arrayList.size();  i++) {
                String temp[] = arrayList.get(i);

                for (int j = 0; j <temp.length ; j++) {
                    if(j==5){
                        System.out.println(temp[5]);
                    }

                }
                //System.out.println();
            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
