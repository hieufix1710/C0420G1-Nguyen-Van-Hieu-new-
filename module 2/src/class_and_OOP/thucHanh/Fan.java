package class_and_OOP.thucHanh;

public class Fan {
    final int slow=1;
    final int medium=2;
    final  int fast=3;
    private int speed=slow;
    private boolean on=false;
    private int radius=5;
    private String color="blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){
        this.speed=slow;
        this.on=true;
        this.color="blue";
        this.radius=5;
    }
    public String toString(){
        return "Speed :"+this.speed+"\n"+"Status :"+this.on+"\n"+"Radius :"+this.radius+"\n "+"Color :"+this.color;
    }
    public static void main(String[] args) {
        Fan fan=new Fan();
        fan.setSpeed(3);
        fan.setOn(true);
        fan.setColor("red");
        fan.setRadius(5);
        System.out.println(fan.toString());

    }
}
