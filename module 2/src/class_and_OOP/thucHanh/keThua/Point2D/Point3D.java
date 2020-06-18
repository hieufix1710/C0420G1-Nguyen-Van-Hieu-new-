package class_and_OOP.thucHanh.keThua.Point2D;

public class Point3D extends Point2D {
    private float  z=0.0f;
    public Point3D(){

    }
    public Point3D(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public float getZ(){
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;

    }
    public float[] getXYZ(){
        float[] XYZ={x,y,z};
        return XYZ;
    }

    @Override
    public String toString() {

        return super.toString()+"z="+this.z;
    }

    public static void main(String[] args) {
        Point2D point = new Point3D(3,4,3);
        System.out.println(point.toString());
    }
}
