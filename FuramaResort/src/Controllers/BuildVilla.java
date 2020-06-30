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

        boolean check=true;
        while (check){
            System.out.println("Enter id of Villa");
            String id=scanner.nextLine();
            boolean checkId= Pattern.compile("SVVL-\\d{4}").matcher(id).matches();
            if (checkId==true) {
                villa.setId(id);
                check=false;
            }
            else {
                System.out.println("ID not valid !");
                check=true;
            }
        }
        System.out.println("Enter standar room :");
        villa.setStandardRoom(scanner.nextLine());
        System.out.println("Enter description :");
        villa.setDescription(scanner.nextLine());
        System.out.println("Enter area use of villa");
        villa.setAreaUSe(scanner.nextInt());
        System.out.println("Enter poolArea :");
        villa.setPoolArea(scanner.nextInt());
        System.out.println("Enter numberOfFloors :");
        villa.setNumberOfFloors(scanner.nextInt());


        return villa;

    }


}
