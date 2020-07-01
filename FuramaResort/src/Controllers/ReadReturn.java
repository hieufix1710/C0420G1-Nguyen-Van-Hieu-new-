package Controllers;

import Models.House;
import Models.Room;
import Models.Villa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadReturn {
    String readVilla(String name) {

        List<Villa> villaList = new ArrayList<>();
        try {
            FileReader reader = new FileReader("src/Data/Villa.csv");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            String[] temp;
            Villa villa;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                villa = new Villa(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3], Integer.parseInt(temp[4])
                        , Integer.parseInt(temp[5]));
                villaList.add(villa);
            }
            Collections.sort(villaList, new Villa());
            for (Villa villa1 : villaList) {
                if (name.equals(villa1.getId())){
                    return villa1.showInfor();
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String readHouse(String name) {
        List<House> houseList = new ArrayList<>();
        try {
            FileReader reader = new FileReader("src/Data/House.csv");
            BufferedReader bufferedReader = new BufferedReader(reader);
//                    StringBuffer stringBuffer = new StringBuffer();
            String line;
            String[] temp;
            House house;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                house = new House(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]));
                houseList.add(house);
            }
            Collections.sort(houseList, new House());
            for (House house1 : houseList) {
               if (name.equals(house1.getId())){
                   return house1.showInfor();
               }
            }
//                    System.out.println(stringBuffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String readRoom(String name) {

        List<Room> roomList = new ArrayList<>();
        try {
            FileReader reader = new FileReader("src/Data/Room.csv");
            BufferedReader bufferedReader = new BufferedReader(reader);
//                    StringBuffer stringBuffer = new StringBuffer();
            String line;
            String[] temp;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                room = new Room(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), temp[5]);
                roomList.add(room);
            }
            Collections.sort(roomList, new Room());
            for (Room room1 : roomList) {
                if (name.equals(room1.getId())){
                    return room1.showInfor();
                }
            }
//                    System.out.println(stringBuffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
