package Controllers;

import Models.Room;

import java.util.Scanner;
import java.util.regex.Pattern;


public class BuildRoom {
    public Room buildRoom() {
//        String id, String standardRoom, String description, int numberOfFloors, int area, String serviceAttached
        Scanner scanner = new Scanner(System.in);
        Room room = new Room();
        System.out.println("Enter id of room :");
        String id = scanner.nextLine();
        boolean checkId = Pattern.compile("SVRO-\\d{4}").matcher(id).matches();
        while (true) {
            if (checkId == true) {
                room.setId(scanner.nextLine());
                break;
            } else {
                System.out.println("ID not valid !");
            }
        }
        System.out.println("Enter standard room :");
        room.setStandardRoom(scanner.nextLine());
        System.out.println("Enter description of room :");
        room.setDescription(scanner.nextLine());
        System.out.println("Enter number of floor");
        room.setNumberOfFloors(scanner.nextInt());
        System.out.println("Entr area use of room");
        room.setArea(scanner.nextInt());
        System.out.println("Enter service attached :");
        room.setServiceAttached(scanner.nextLine());
        return room;
    }
}
