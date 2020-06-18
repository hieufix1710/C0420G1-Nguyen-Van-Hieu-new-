package class_and_OOP.thucHanh.keThua.hinhHoc2;

public class Cylinder  extends Circle{
    double height;


    public double getHeight() {
        return height;
    }
    public Cylinder(double radius,String color,double height){
        super(radius, color);
        this.height=height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        double Volume=Math.pow(radius,2)*PI*height;
        return  Volume;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", PI=" + PI
                +"Volume :"+getVolume();
    }
}
