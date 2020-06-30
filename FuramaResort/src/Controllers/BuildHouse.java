package Controllers;

import Models.House;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BuildHouse {
    public House buildHouse() {
        Scanner scanner = new Scanner(System.in);

        House house = new House();
        System.out.println("Enter id of house");
        String id = scanner.nextLine();
        boolean checkId = Pattern.compile("SVHO-\\d{4}").matcher(id).matches();
        while (true) {
            if (checkId == true) {
                house.setId(scanner.nextLine());
                break;
            } else {
                System.out.println("ID not valid !");
            }
        }
        System.out.println("Enter standar room of house");
        house.setStandardRoom(scanner.nextLine());
        System.out.println("Enter description of house");
        house.setDescription(scanner.nextLine());
        System.out.println("Enter number of floor of house :");
        house.setNumberOfFloors(scanner.nextInt());
        System.out.println("Entr area use of house");
        house.setArea(scanner.nextInt());
        return house;

    }
}
