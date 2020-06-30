package input_output_text.bai_tap.bai1_coppy_text_file;


import java.io.*;

public class CoppyTextFile {
    public static String PATH="src/input_output_text/bai_tap/bai1_coppy_text_file/";
    public void write(String string){
        File file=new File(PATH,"text2.txt");
        try {
            file.createNewFile();
            System.out.println("Created file !");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter writer=new FileWriter(file);
            writer.write(string);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public StringBuffer  read(){
        File file=new File(PATH,"text.txt");
        StringBuffer stringBuffer=new StringBuffer();
        try {
            FileReader reader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);

            String line;
            while ((line=bufferedReader.readLine())!=null){
                stringBuffer.append(line+"\n");
            }
            System.out.println(stringBuffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer;
    }

    public static void main(String[] args) {
        CoppyTextFile coppyTextFile=new CoppyTextFile();
        StringBuffer stringBuffer =  coppyTextFile.read();
        coppyTextFile.write(stringBuffer.toString());
    }

}
