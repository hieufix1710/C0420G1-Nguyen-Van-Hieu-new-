package class_and_OOP.thucHanh.keThua.hinhHoc;

public class Square extends Rectangle {
    double width;

    double side;

    public Square(double v){
      this.width=1.0;
      this.side=1.0;
    }

    public Square(double v, String yellow, boolean b) {

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return  "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    public static class SquareTest {
        public static void main(String[] args) {
            Square square = new Square(2.3);
            System.out.println(square);

            square = new Square(2.3);
            System.out.println(square);

            square = new Square(5.8, "yellow", true);
            System.out.println(square);
        }
    }

}
