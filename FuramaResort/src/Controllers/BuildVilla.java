package Controllers;

import Models.Villa;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BuildVilla {
    public Villa BuildVilla() {
//        String id, String standardRoom, int area, String description, int poolArea, int numberOfFloors
        Scanner scanner = new Scanner(System.in);
        Villa villa = new Villa();


        // nhap du lieu tu ban phim de build 1 villa

        boolean check = true;
        while (check) {
            System.out.println("Enter id of Villa");
            String id = scanner.nextLine();
            boolean checkId = Pattern.compile("SVVL-\\d{4}").matcher(id).matches();
            if (checkId == true) {
                villa.setId(id);
                check = false;
            } else {
                System.out.println("ID not valid !");
                check = true;
            }
        }
        check = true;
        scanner.nextLine();
        System.out.println("Enter standar room :");
        villa.setStandardRoom(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Enter description :");
        villa.setDescription(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Enter area use of villa");
        int areaUse = scanner.nextInt();
        while (check) {
            if (areaUse > 0 && areaUse > 30) {
                villa.setAreaUSe(areaUse);
                check = false;
            } else {
                System.out.println("This area not valid !");
                check = true;
            }
        }
        check = true;
        scanner.nextLine();
        System.out.println("Enter poolArea :");
        int poolArea = scanner.nextInt();
        while (check) {
            if (poolArea > 0 && poolArea > 30) {
                villa.setPoolArea(poolArea);
                check = false;
            } else {
                System.out.println("This pool area not valid !");
                check = true;
            }
        }
        check = true;
        scanner.nextLine();
        System.out.println("Enter numberOfFloors :");
        int numberFloor = scanner.nextInt();
        while (check) {
            if (numberFloor > 0) {
                villa.setNumberOfFloors(numberFloor);
                check = false;
            } else {
                System.out.println("This number of floor not valid !");
                check = true;
            }
        }
        scanner.nextLine();



        return villa;

    }


}
