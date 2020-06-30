package collection_framework.bai_tap;




import java.io.*;
import java.util.ArrayList;

public class FileUtil {
    public static final String PATH = "src/collection_framework/bai_tap/manager.csv";
    public static final String COMMA = ",";

    public static ArrayList<Product> readCSV() {
        BufferedReader bufferedReader = null;
        ArrayList<Product> productList = new ArrayList<Product>();
        try {
            FileReader fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Product product;
            String[] str;
            while ((line = bufferedReader.readLine()) != null) {
                str = line.split(",");
                product = new Product(Integer.parseInt(str[0]),str[1], Integer.parseInt(str[2]));
                productList.add(product);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;


    }
    public static void writeCSV(Product product,boolean append){
        if (product==null)return;
        BufferedWriter bufferedWriter;
        try {
            FileWriter writer=new FileWriter(PATH,append);
             bufferedWriter=new BufferedWriter(writer);
            StringBuffer stringBuffer=new StringBuffer();
            stringBuffer.append(product.getId()).append(COMMA);
            stringBuffer.append(product.getName()).append(COMMA);
            stringBuffer.append(product.getPrice()).append(COMMA);

            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.newLine();


            bufferedWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
