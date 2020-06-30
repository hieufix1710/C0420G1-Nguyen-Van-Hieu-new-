package input_output_binary.bai_tap.bai1_coppy_file_binary;


import input_output_binary.thuc_hanh.bai4.Product;

import java.io.*;

public class CoppyFileBinary {

    public void  write(Product product){
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("src/input_output_binary/bai_tap/bai1_coppy_file_binary/text1.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(product);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void Coppy() {
        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(
                    "src/input_output_binary/bai_tap/bai1_coppy_file_binary/text1.txt"));

            ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(
                    "src/input_output_binary/bai_tap/bai1_coppy_file_binary/text2.txt"));
            write.writeObject(objectInputStream.readObject());
            objectInputStream.close();
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void display() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/input_output_binary/bai_tap/bai1_coppy_file_binary/text2.txt"));
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

        CoppyFileBinary oob=new CoppyFileBinary();
        Product product=new Product(1,"iphone4","Apple",1000,"Da ngung san xuat");
        oob.write(product);
        oob.Coppy();
        oob.display();
    }

}
