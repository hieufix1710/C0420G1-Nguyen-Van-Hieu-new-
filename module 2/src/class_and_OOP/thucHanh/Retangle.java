package class_and_OOP.thucHanh;

import java.util.Scanner;

public class Retangle {
    double width;
    double height;
    public   void Retangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return  (this.width+this.height)*2;
    }
    public double getPremettr(){
        return this.width*this.height;
    }
    public void display(){
        System.out.println("This area of retangle :"+ getArea());
        System.out.println("This perimeter of retangle :"+ getPremettr());
    }

    public static void main(String[] args) {
        Retangle retangle=new Retangle();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter width of retangle :");
        retangle.width=scanner.nextDouble();
        System.out.println("Enter height there :");
        retangle.height=scanner.nextDouble();
        retangle.display();

    }
}
