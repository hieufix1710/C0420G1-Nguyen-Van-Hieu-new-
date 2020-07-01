package Models;

import java.util.Comparator;

public class Villa extends Services implements Comparable<Villa>,Comparator<Villa> {
    private String id;
    private String standardRoom;
    protected int areaUSe;
    private String description;
    private int poolArea;
    private int numberOfFloors;

    public Villa() {

    }

    public int getAreaUSe() {
        return areaUSe;
    }

    public void setAreaUSe(int areaUSe) {
        this.areaUSe = areaUSe;
    }

    public Villa(String id, String standardRoom, int area, String description, int poolArea, int numberOfFloors) {
        this.id = id;
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.areaUSe = area;
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

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }


    @Override
    public String showInfor() {
        return "Villa{" +
                "id='" + id + '\'' +
                ", standardRoom='" + standardRoom + '\'' +
                ", areaUSe=" + areaUSe +
                ", description='" + description + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }




    @Override
    public int compareTo(Villa o) {
        int result=this.getId().substring(6,9).compareTo(o.getId().substring(6,9));
        return result;
    }



    @Override
    public int compare(Villa o1, Villa o2) {
        if (o1.getAreaUSe()>o2.getAreaUSe()){
            return 1;
        }else if (o1.getAreaUSe()<o2.getAreaUSe()){
            return -1;
        }else return 0;
    }
}
