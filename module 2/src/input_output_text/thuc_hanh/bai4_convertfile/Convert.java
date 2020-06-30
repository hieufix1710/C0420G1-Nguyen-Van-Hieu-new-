package input_output_text.thuc_hanh.bai4_convertfile;

import java.io.*;
import java.util.ArrayList;

public class Convert {
    public static String PATH="src/input_output_text/thuc_hanh/bai4_convertfile/num";
    public void Covert(){
        File file=new File(PATH);
        try {
            FileReader reader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            StringBuffer stringBuffer=new StringBuffer();
            String line;
            ArrayList<String[]> arrayList = new ArrayList<>();
            while ((line=bufferedReader.readLine())!=null){
                arrayList.add(line.split(" "));
            }
            FileWriter writer=new FileWriter(new File("src/input_output_text/thuc_hanh/bai4_convertfile/result"));

            for (int i = 0; i <arrayList.size() ; i++) {
                String temp[] =arrayList.get(i);
                for (int j = 0; j <temp.length ; j++) {
                    System.out.println(temp[j]);
                  writer.write( convert(temp[j])+"\n");
                }

            }
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int convert(String temp){
        String digits = "0123456789ABCDEF";
        temp = temp.toUpperCase();
        int val = 0;
        for (int k = 0; k < temp.length(); k++)
        {
            char c = temp.charAt(k);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;

    }

    public static void main(String[] args) {
        Convert convert=new Convert();
        convert.Covert();
    }
}
