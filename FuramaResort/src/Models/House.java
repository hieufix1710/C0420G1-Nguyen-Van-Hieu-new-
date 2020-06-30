package Models;

import java.util.Comparator;

public class House extends Services implements Comparator<House> {
    protected String id;
    protected String standardRoom;
    protected String  description;
    protected int numberOfFloors;
    protected int area;


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public House(String id, String standardRoom, String description, int numberOfFloors, int area) {
        this.id = id;
        this.standardRoom = standardRoom;
        this.description = description;
        this.numberOfFloors = numberOfFloors;
        this.area=area;
    }

    public House() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }



    @Override
    public String showInfor() {
        return "House{" +
                "id='" + id + '\'' +
                ", standardRoom='" + standardRoom + '\'' +
                ", description='" + description + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", area=" + area +
                '}';
    }

    @Override
    public int compare(House o1, House o2) {
        if (o1.getArea()>o2.getArea()){
            return 1;
        }else if (o1.getArea()<o2.getArea()){
            return -1;
        }else return 0;
    }
}
