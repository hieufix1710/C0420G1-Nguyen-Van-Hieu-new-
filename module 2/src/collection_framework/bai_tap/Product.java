package collection_framework.bai_tap;


import java.util.Comparator;

public class Product implements Comparator<Product> {
    public  int id;
    public  String name;
    public  int price;


    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void getPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compare(Product o1, Product o2) {
        if (o1.price==o2.price)
            return o1.name.compareTo(o2.name);
        else if (o1.price>o2.price)
            return 1;
        else
            return -1;
    }

//    @Override
//    public int compareTo(Product o) {
//        if (this.price==o.price){
//           return (this.name.compareTo(o.name));
//        }
//
//        else if (this.price>o.price)
//            return 1;
//        else
//            return -1;
//    }
}
