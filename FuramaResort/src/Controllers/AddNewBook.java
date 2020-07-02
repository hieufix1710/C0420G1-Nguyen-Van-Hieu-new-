package Controllers;

import Models.Customer;

import java.io.*;
import java.util.*;

public class AddNewBook {

    private String inputNameService;
    //This method return information customer
    public String readCustomer(String nameCustomer) {
        FileReader fileReader;
        Map<Integer, Customer> customerList = new HashMap<>();
        try {
            fileReader = new FileReader("src/Data/Customer.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                customer = new Customer(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]),
                        Integer.parseInt(temp[4]), temp[5], temp[6]);
                customerList.put(count++, customer);
            }
//            Set<Integer> set = customerList.keySet();
//            for (Integer key : set) {
//                System.out.println(key + "-" + customerList.get(key).showInfor());
//            }

            Set<Integer> set = customerList.keySet();
            for (int i = 0; i < set.size(); i++) {
                if (nameCustomer.equals(customerList.get(i).getName())) {
                    return customerList.get(i).showInfor();
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
    //This method return information service customer selected !
    public String readService(int choose) {
        switch (choose) {
            case 1:
                ReadReturn readReturn = new ReadReturn();
                WriteAndReadCSV writeAndReadCSV = new WriteAndReadCSV();
                writeAndReadCSV.read(1);
                System.out.println("Enter id of villa need book for customer :");
                String nameService = new Scanner(System.in).nextLine();
                inputNameService = readReturn.readVilla(nameService);
                return inputNameService;
            case 2:
                ReadReturn readReturn1 = new ReadReturn();
                WriteAndReadCSV writeAndReadCSV1 = new WriteAndReadCSV();
                writeAndReadCSV1.read(2);
                System.out.println("Enter name of house need book for customer :");
                String nameService1 = new Scanner(System.in).nextLine();
                inputNameService = readReturn1.readHouse(nameService1);
                return inputNameService;
            case 3:
                ReadReturn readReturn2 = new ReadReturn();
                WriteAndReadCSV writeAndReadCSV2 = new WriteAndReadCSV();
                writeAndReadCSV2.read(3);
                System.out.println("Enter nam of room need book for customer :");
                String nameService2 = new Scanner(System.in).nextLine();
                inputNameService = readReturn2.readRoom(nameService2);
                return inputNameService;
            default:
                System.out.println("Not valid !");
                return null;

        }
    }
    //Write information customer booking which service to file booking data
    public void writeToFile() {
        //display list customer to screen
        WriteAndReadCSV writeAndReadCSV = new WriteAndReadCSV();
        writeAndReadCSV.read(4);
        //Input name of customer need booking
        System.out.println("Enter name customer need booking :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String s1 = readCustomer(name);   // information of customer selected
        System.out.println("Menu");
        System.out.println("1. Booking Villa :");
        System.out.println("2. Booking House :");
        System.out.println("3. Booking Room :");
        int choose = new Scanner(System.in).nextInt();
        String s2 = readService(choose); //  information of service selected
        //Write to file booking data
        try {
            FileWriter fileWriter = new FileWriter("src/Data/Booking.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(s1);
            stringBuffer.append(" has booking this :");
            stringBuffer.append(s2);
            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("Booking success !");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}


