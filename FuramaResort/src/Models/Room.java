package Models;

import java.util.Comparator;

public class Room extends Services implements Comparable<Room>, Comparator<Room> {
    protected String id;
    protected String standardRoom;
    protected String  description;
    protected int numberOfFloors;
    protected int area;
    protected String serviceAttached;

    public Room(String id, String standardRoom, String description, int numberOfFloors, int area, String serviceAttached) {
        this.id = id;
        this.standardRoom = standardRoom;
        this.description = description;
        this.numberOfFloors = numberOfFloors;
        this.area = area;
        this.serviceAttached = serviceAttached;
    }

    public Room() {

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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getServiceAttached() {
        return serviceAttached;
    }

    public void setServiceAttached(String serviceAttached) {
        this.serviceAttached = serviceAttached;
    }




    @Override
    public String showInfor() {
        return "Room{" +
                "id='" + id + '\'' +
                ", standardRoom='" + standardRoom + '\'' +
                ", description='" + description + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", area=" + area +
                ", serviceAttached='" + serviceAttached + '\'' +
                '}';
    }

    @Override
    public int compare(Room o1, Room o2) {
        if (o1.getArea()>o2.getArea()){
            return 1;
        }else if (o1.getArea()<o2.getArea()){
            return -1;
        }else return 0;
    }

    @Override
    public int compareTo(Room o) {
        return this.getId().substring(6,9).compareTo(o.getId().substring(6,9));
    }


}
