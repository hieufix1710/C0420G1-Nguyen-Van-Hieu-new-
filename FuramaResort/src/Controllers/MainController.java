package Controllers;

import Models.Customer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;


public class MainController {
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1.Add New Services" + "\n" + "2.Show services" + "\n" + "3.Add New Customer" + "\n" +
                "4.Show Information of Customer" + "\n" + "5.Add New Booking" + "\n" + "6.Show Information of Employee" + "\n" +
                "7.Exit");
        int choose1 = scanner.nextInt();
        switch (choose1) {
            case 1:
                addNewSevices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                WriteAndReadCSV writeAndReadCSV3 = new WriteAndReadCSV();
                writeAndReadCSV3.read(4);
                displayMainMenu();
                break;
            case 5:
                addNewBooking();

                break;
            case 6:
                WriteAndReadCSV writeAndReadCSV4 = new WriteAndReadCSV();
                writeAndReadCSV4.read(5);
                displayMainMenu();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Not valid ! Try again !");
        }
    }


    public void addNewSevices() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1.Add New Villa" + "\n" + "2.Add New House" + "\n" + "3.Add New Room" + "\n" + "4.Back to menu" + "\n" +
                "5.Exit");
        int choose2 = scanner.nextInt();
        switch (choose2) {

            case 1:
                WriteAndReadCSV writeAndReadCSV = new WriteAndReadCSV();
                writeAndReadCSV.writeVilla();
                displayMainMenu();
                break;
            case 2:
                WriteAndReadCSV writeAndReadCSV1 = new WriteAndReadCSV();
                writeAndReadCSV1.writeHouse();
                displayMainMenu();
                break;
            case 3:
                WriteAndReadCSV writeAndReadCSV2 = new WriteAndReadCSV();
                writeAndReadCSV2.writeRoom();
                displayMainMenu();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Not valid !");
        }
    }

    public void showServices() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1.Show all Villa" + "\n" + "2.Show all House" + "\n" + "3.Show all Room" + "\n" + "4.Show " +
                "All Name Villa Not Duplicate\n" + "5.Show All Name House Not Duplicate" + "\n" + "6.Show All Name Name Not Duplicate" + "" +
                "7.Back to menu" + "\n" + "8.Exit");
        int choose3 = scanner.nextInt();
        switch (choose3) {
            case 1:
                WriteAndReadCSV writeAndReadCSV = new WriteAndReadCSV();
                writeAndReadCSV.read(1);
                displayMainMenu();
                break;
            case 2:
                WriteAndReadCSV writeAndReadCSV1 = new WriteAndReadCSV();
                writeAndReadCSV1.read(2);
                displayMainMenu();
                break;
            case 3:
                WriteAndReadCSV writeAndReadCSV2 = new WriteAndReadCSV();
                writeAndReadCSV2.read(3);
                displayMainMenu();
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Not valid !");
        }
    }


    public void addNewCustomer() {
        Customer customer;
        BuildCustomer buildCustomer = new BuildCustomer();
        customer = buildCustomer.buildCustomer();

        try {
            FileWriter fileWriter = new FileWriter("src/Data/Customer.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(customer.getName());
            stringBuffer.append(",");
            stringBuffer.append(customer.getBirthday());
            stringBuffer.append(",");
            stringBuffer.append(customer.getGender());
            stringBuffer.append(",");
            stringBuffer.append(customer.getCMND());
            stringBuffer.append(",");
            stringBuffer.append(customer.getPhoneNumber());
            stringBuffer.append(",");
            stringBuffer.append(customer.getEmail());
            stringBuffer.append(",");
            stringBuffer.append(customer.getTypeCustomer());
            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void addNewBooking(){
        WriteAndReadCSV writeAndReadCSV=new WriteAndReadCSV();
        writeAndReadCSV.read(4);
        System.out.println("Enter id of customer to booking :");      //task7





    }

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.displayMainMenu();

    }


}
