package collection_framework.bai_tap;

import java.util.ArrayList;

public class ProductManager {
    ArrayList<Product> productArrayList;

    public ProductManager(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public ProductManager() {
    }

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public void setProductArrayList(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }
    public void updateProduct(Product product){
        if (productArrayList.contains(product)){
            productArrayList.remove(product);
            productArrayList.add(product);
        }
        else {
            productArrayList.add(product);
        }
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "productArrayList=" + productArrayList +
                '}';
    }
}
