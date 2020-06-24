package collection_framework.bai_tap;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;



public class ProductManager {



    private ArrayList<Product> arrayList;


    public ProductManager() {
        arrayList = new ArrayList<>();
    }

    public ProductManager(ArrayList<Product> arrayList) {
        this.arrayList = arrayList;
    }

    public void add(Product product) {
        arrayList.add(product);

    }

    public ArrayList<Product> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Product> arrayList) {
        this.arrayList = arrayList;
    }

    public Product search(Integer id) {
        if (arrayList == null) return null;
        else {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).id == id) {
                    return arrayList.get(i);
                }

            }
        }
        return null;
    }
    public boolean edit(Integer id,String name,Integer price){
       if (search(id)!=null){
            search(id).setName(name);
            search(id).price =price;
            return true;
       }
       return false;

    }
    public String delete(Integer id){
        if (search(id)!=null){
            arrayList.remove(search(id));
            return "Delete success !";

        }
        return "False :(";
    }



}
