package class_and_OOP.thucHanh;

import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a :");
        double a=scanner.nextDouble();
        System.out.println("Enter b :");
        double b=scanner.nextDouble();
        System.out.println("Enter c :");
        double c=scanner.nextDouble();
        QE qe1=new QE(a,b,c);
        qe1.display();

    }

    public static class QE {
        double a, b, c, x1, x2;

        public QE(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.x1 = x1;
            this.x2 = x2;

        }
        public double getDelta(){
            return this.b*this.b-4*this.a*this.c ;
        }
        public double getRoot1(){
            return this.x1=(-b+Math.sqrt(b*b-4*a*c)/2*a);
        }
        public double getRoot2(){
            return this.x2=(-b-Math.sqrt(b*b-4*a*c)/2*a);
        }
        public void display(){
            System.out.println("Delta of this is :"+getDelta());
            if (getDelta()>0)
            System.out.println("Root 1 :"+getRoot1());
            System.out.println("Root 2 :"+getRoot2());
        }


    }


}

