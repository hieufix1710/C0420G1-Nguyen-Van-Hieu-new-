package Controllers;

import Models.*;

import java.io.*;
import java.util.*;


public class WriteAndReadCSV {
    public static final String PATH1 = "src/Data/Villa.csv";
    public static final String PATH2 = "src/Data/House.csv";
    public static final String PATH3 = "src/Data/Room.csv";
    public static final String COMA = ",";
    Villa villa;
    House house;
    Room room;
    //Add villa service to file data
    public void writeVilla() {
        BuildVilla buildVilla = new BuildVilla();

        //Build villa service
        villa = buildVilla.BuildVilla();

        //Write villa service to file data
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
    //Add house service to fila data
    public void writeHouse() {
        BuildHouse buildHouse = new BuildHouse();
        //Build house service
        house = buildHouse.buildHouse();
        //Write house service to fila data
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
    //Add room service to file data
    public void writeRoom() {
        BuildRoom buildRoom = new BuildRoom();
        //Build room service
        room = buildRoom.buildRoom();

        //Write room service to file data
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

    //Display data service not duplicate
    public void read(int choose) {
        switch (choose) {
            //Display data villa service in file data
            case 1:
                Set<Villa> villaList = new TreeSet<>();
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
//                    Collections.sort(villaList, new Villa());
                    for (Villa villa1 : villaList) {
                        System.out.println(villa1.showInfor());
                    }


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
             //Display data house service  in file data
            case 2:
                Set<House> houseList = new TreeSet<>();
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
//                    Collections.sort(houseList, new House());
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
             //Display room data in file data
            case 3:
                Set<Room> roomList = new TreeSet<>();
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
//                    Collections.sort(roomList, new Room());
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
                // Display list customer
                Set<Customer> customerList = new TreeSet<>();
                try {
                    FileReader reader = new FileReader("src/Data/Customer.csv");
                    BufferedReader bufferedReader = new BufferedReader(reader);
//                    StringBuffer stringBuffer = new StringBuffer();
                    String line;
                    String[] temp;
                    Customer customer;
                    while ((line = bufferedReader.readLine()) != null) {
                        temp = line.split(",");
                        customer = new Customer(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]),
                                Integer.parseInt(temp[4]), temp[5], temp[6]);
                        customerList.add(customer);
                    }
//                    Collections.sort(customerList,new Customer());
                    int count = 1;

                    for (Customer customer1 : customerList) {
                        System.out.println(count++ + "." + customer1.showInfor());
                    }

//                    System.out.println(stringBuffer);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 5:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose type print out :");
                System.out.println("1.Print by set :");
                System.out.println("2.Print by map :");
                int choosePrint = scanner.nextInt();
                switch (choosePrint) {
                    case 1:
                        System.out.println("Print information by SET :");
                        Set<Employee> employeeList = new TreeSet<>();
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
//                    Collections.sort(employeeList, new Employee()); dung array list
                            for (Employee employee1 : employeeList) {
                                System.out.println(employee1.showInfor());
                            }
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        System.out.println("Print information by MAP :");
                        Map<String, Employee> map = new HashMap<>();
                        try {
                            FileReader fileReader = new FileReader("src/Data/Employee.csv");
                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                            String line;
                            String[] temp;
                            Employee employee;

                            while ((line = bufferedReader.readLine()) != null) {
                                temp = line.split(",");
                                employee = new Employee(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), temp[4], temp[5], temp[6], Integer.parseInt(temp[7]));
                                map.put(temp[0], employee);
                            }
                            Set<String> set = map.keySet();
                            for (String key : set) {
                                System.out.println(key + "-" + map.get(key).showInfor());
                            }

                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }


                        break;

                }

                break;

            default:
                System.out.println("Not valid !");
        }

    }
    //Display all data service
    public void readAll(int choose) {
        switch (choose) {
            //Display all villa service in file data
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
             //Display all house service in file data
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
              //Display all room service in file data
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
        }

    }
}