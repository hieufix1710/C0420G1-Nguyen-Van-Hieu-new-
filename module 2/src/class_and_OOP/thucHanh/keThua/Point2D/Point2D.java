package class_and_OOP.thucHanh.keThua.Point2D;

public class Point2D {

    static float x;
    static float y;
    public Point2D(){

    }
    public Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
           float[] XY={x,y};
           return XY;
    }

    @Override
    public String toString() {
        return "x=" + x + "y=" + y;
    }

    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        System.out.println(point2D);
    }
}
