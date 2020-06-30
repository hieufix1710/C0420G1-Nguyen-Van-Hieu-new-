package debug_and_exeption.bai_tap.bai1;

public class Triangle {
    private double a;
    private double b;
  private   double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
//        if (a<0||b<0||c<0) throw new IllegalTriangleException("Canh tam giac khong hop le.");
        if (a<0)throw new IllegalTriangleException("canh a khong hop le");
        if (b<0)throw new IllegalTriangleException("canh b khong hop le");
        if (c<0)throw new IllegalTriangleException("canh c khong hop le");
        if (a>(b+c)) throw new IllegalTriangleException("Canh "+a+" co gia tri khong hop le.");
        if (b>(a+c)) throw new IllegalTriangleException("Canh "+b+" co gia tri khong hop le.");
        if (c>(a+b)) throw new IllegalTriangleException("Canh "+c+" co gia tri khong hop le.");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}
