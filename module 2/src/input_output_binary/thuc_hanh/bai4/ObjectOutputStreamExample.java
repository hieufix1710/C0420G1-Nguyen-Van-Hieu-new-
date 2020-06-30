package input_output_binary.thuc_hanh.bai4;

import java.io.*;

public class ObjectOutputStreamExample {

    public void  write(Product product){
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("src\\input_output_binary\\thuc_hanh\\bai4\\out.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(product);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void display() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src\\input_output_binary\\thuc_hanh\\bai4\\out.txt"));
            Product product = (Product) objectInputStream.readObject();
            System.out.println(product.toString());
            objectInputStream.close();

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ObjectOutputStreamExample oob=new ObjectOutputStreamExample();
        Product product=new Product(1,"iphone4","Apple",1000,"Da ngung san xuat");
        oob.write(product);
        oob.display();

    }


}
