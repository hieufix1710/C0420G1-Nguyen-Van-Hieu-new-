package class_and_OOP.thucHanh.keThua.Point;

public class MovablePoint extends Point{
    float xSpeed=0.0f;
    float ySpeed=0.0f;
    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;

    }
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(){

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] getSpeed =new float[2];
        getSpeed[0]=xSpeed;
        getSpeed[1]=ySpeed;
        return getSpeed;
    }
    public void move(){
        x+=xSpeed;
        y+=ySpeed;

    }


    @Override
    public String toString() {
        return "{" +super.toString()+
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
