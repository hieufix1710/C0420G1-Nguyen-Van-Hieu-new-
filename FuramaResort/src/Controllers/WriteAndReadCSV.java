package Controllers;

import Models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class WriteAndReadCSV {
    public static final String PATH1 = "src/Data/Villa.csv";
    public static final String PATH2 = "src/Data/House.csv";
    public static final String PATH3 = "src/Data/Room.csv";
    public static final String COMA = ",";
    Villa villa;
    House house;
    Room room;

    public void writeVilla() {
        BuildVilla buildVilla = new BuildVilla();
        villa = buildVilla.BuildVilla();

        try {
            FileWriter writer = new FileWriter(PATH1, true);

            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            StringBuffer stringBuffer = new StringBuffer();

            stringBuffer.append(villa.getId());
            stringBuffer.append(COMA);
            stringBuffer.append(villa.getStandardRoom());
            stringBuffer.append(COMA);
            stringBuffer.append(villa.getDescription());
            stringBuffer.append(COMA);
            stringBuffer.append(villa.getPoolArea());
            stringBuffer.append(COMA);
            stringBuffer.append(villa.getNumberOfFloors());
            stringBuffer.append(COMA);
            stringBuffer.append(villa.getAreaUSe());

            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeHouse() {
        BuildHouse buildHouse = new BuildHouse();
        house = buildHouse.buildHouse();

        try {
            FileWriter writer = new FileWriter(PATH2, true);

            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(house.getId());
            stringBuffer.append(COMA);
            stringBuffer.append(house.getStandardRoom());
            stringBuffer.append(COMA);
            stringBuffer.append(house.getDescription());
            stringBuffer.append(COMA);
            stringBuffer.append(house.getNumberOfFloors());
            stringBuffer.append(house.getArea());
            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeRoom() {
        BuildRoom buildRoom = new BuildRoom();
        room = buildRoom.buildRoom();


        try {
            FileWriter writer = new FileWriter(PATH3, true);


            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            StringBuffer stringBuffer = new StringBuffer();

            stringBuffer.append(room.getId());
            stringBuffer.append(COMA);
            stringBuffer.append(room.getStandardRoom());
            stringBuffer.append(COMA);
            stringBuffer.append(room.getDescription());
            stringBuffer.append(COMA);
            stringBuffer.append(room.getNumberOfFloors());
            stringBuffer.append(COMA);
            stringBuffer.append(room.getArea());
            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void read(int choose) {
        switch (choose) {
            case 1:
                List<Villa> villaList = new ArrayList<>();
                try {
                    FileReader reader = new FileReader(PATH1);
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
                        System.out.println(villa1.showInfor());
                    }


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                List<House> houseList = new ArrayList<>();
                try {
                    FileReader reader = new FileReader(PATH2);
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
                        System.out.println(house1.showInfor());
                    }
//                    System.out.println(stringBuffer);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                List<Room> roomList = new ArrayList<>();
                try {
                    FileReader reader = new FileReader(PATH3);
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
                        System.out.println(room1.showInfor());
                    }
//                    System.out.println(stringBuffer);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                List<Customer> customerList = new ArrayList<>();
                try {
                    FileReader reader = new FileReader("src/Data/Customer.csv");
                    BufferedReader bufferedReader = new BufferedReader(reader);
//                    StringBuffer stringBuffer = new StringBuffer();
                    String line;
                    String[] temp;
                    Customer customer;
                    while ((line = bufferedReader.readLine()) != null) {
                        temp = line.split(",");
                        customer = new Customer(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), temp[5], temp[6]);
                        customerList.add(customer);
                    }
                    int count=1;
                    for (Customer customer1 : customerList) {
                        System.out.println(count++ +"." +customer1.showInfor());
                    }

//                    System.out.println(stringBuffer);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 5:
                List<Employee> employeeList = new ArrayList<>();
                try {
                    FileReader fileReader = new FileReader("src/Data/Employee.csv");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    String[] temp;
                    Employee employee;
                    while ((line = bufferedReader.readLine()) != null) {
                        temp = line.split(",");
                        employee = new Employee(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), temp[4], temp[5], temp[6], Integer.parseInt(temp[7]));
                        employeeList.add(employee);
                    }
                    Collections.sort(employeeList, new Employee());
                    for (Employee employee1 : employeeList) {
                        System.out.println(employee1.showInfor());
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            default:
                System.out.println("Not valid !");
        }

    }
}
