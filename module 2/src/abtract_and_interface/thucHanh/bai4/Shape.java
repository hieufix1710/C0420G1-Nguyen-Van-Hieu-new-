package abtract_and_interface.thucHanh.bai4;

public class Shape {
    String color;
    boolean fill;

    public Shape() {
        this.color = "Green";
        this.fill = true;
    }

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    @Override
    public String toString() {
        return "A shape with color of " + getColor() + (isFill() ? "Filled" : "Not filled");
    }


    public static class ShapeTest {
        public static void main(String[] args) {
           Shape[] shapes=new Shape[2];
           shapes[0]=new Rectangle(2.0,2.0,"Blue",true);
           shapes[1]= new Square(2.0,2.0,3.0);
           Rectangle a=(Rectangle) shapes[0];
           System.out.println("Area of rectangle :"+a.getArea());
           Square b=(Square) shapes[1];
           System.out.println("Area of square :"+ b.getSide());
           if (b.getColor()!=null){
               System.out.println(b.howToColor());
           }
           else {
               System.out.println("Square not have color");
           }

        }
    }


}
