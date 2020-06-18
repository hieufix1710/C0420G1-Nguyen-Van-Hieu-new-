package class_and_OOP.thucHanh.keThua.hinhHoc;

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
            Shape shape = new Shape();
            System.out.println(shape.toString());


        }
    }
}
