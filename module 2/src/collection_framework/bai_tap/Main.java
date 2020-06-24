package collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(0, "Hieu", 20);
        Product product1 = new Product(1, "Hai", 20);
        Product product2 = new Product(2, "huong", 12);
        Product product3 = new Product(3, "hong", 23);
        ProductManager productManager = new ProductManager();
//        ArrayList<Product> arrayList=new ArrayList<>();
        productManager.getArrayList().add(product);
        productManager.getArrayList().add(product1);
        productManager.getArrayList().add(product2);
        productManager.getArrayList().add(product3);

//        arrayList.add(product);
//        arrayList.add(product1);
//        arrayList.add(product2);
//        arrayList.add(product3);
//



        Collections.sort(productManager.getArrayList(),new Product());

        for (Product a:productManager.getArrayList()) {

            System.out.println(a);
        }

    }
}
