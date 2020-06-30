package collection_framework.bai_tap;

public class Main {
    public static void main(String[] args) {

        ProductManager productManager=new ProductManager(FileUtil.readCSV());

        for (Product p:productManager.getProductArrayList()) {
            System.out.println(p);
        }

        FileUtil.writeCSV(new Product(1,"abc",500),true);
        for (Product p:productManager.getProductArrayList()) {
            System.out.println(p);
        }


    }
}
