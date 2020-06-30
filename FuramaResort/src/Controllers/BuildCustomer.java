package Controllers;

import Models.Customer;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BuildCustomer {
    public Customer buildCustomer(){
        Scanner scanner=new Scanner(System.in);
        Customer customer=new Customer();

        boolean check=true;
        while (check){
            System.out.println("Enter information of customer :");
            System.out.println("Enter name of customer :");
            String name =scanner.nextLine();
            boolean checkName= Pattern.compile("^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$").matcher(name).matches();
            if (checkName==true){
                customer.setName(name);
                check=false;
            }else {
                System.out.println("This name not valid ! Try again !");
                check=true;
            }
        }
        check=true;

        while (check){
            System.out.println("Enter birthday of customer :");
            String birthday=scanner.nextLine();
            boolean checkBirthday=Pattern.compile("\\d{2}[-|/]\\d{2}[-|/]\\d{4}").matcher(birthday).matches();
            if (checkBirthday==true){
                customer.setBirthday(birthday);
                check=false;
            }else {
                System.out.println("Birthday not valid !");
                check=true;
            }
        }
        check=true;

        while (check){
            System.out.println("Enter gender of customer :");
            String gender=scanner.nextLine();
            boolean checkGender=Pattern.compile("MALE||FEMALE||UNKNOWN").matcher(gender).matches();
            if (checkGender==true){
                customer.setGender(gender);
                check=false;
            }else {
                System.out.println("This gender not valid !");
                check=true;
            }
        }
        check=true;

        while (check){
            System.out.println("Enter CMND of customer :");
            String CMND=scanner.nextLine();
            boolean checkCMND=Pattern.compile("\\d{8,12}").matcher(CMND).matches();
            if (checkCMND==true){
                customer.setCMND(Integer.parseInt(CMND));
                check=false;
            }else {
                System.out.println("CMND not valid");
                check=true;
            }
        }
        check=true;

        while (check){
            System.out.println("Enter email of customer :");
            String email=scanner.nextLine();
            boolean checkEmail=Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$").matcher(email).matches();
            if (checkEmail==true){
                customer.setEmail(email);
                check=false;
            }else {
                System.out.println("Email not valid !");
                check=true;
            }
        }
        check=true;

        while (check){
            System.out.println("Enter phone number of customer :");
            String phoneNumber=scanner.nextLine();
            boolean checkPhone=Pattern.compile("\\d{9,10}$").matcher(phoneNumber).matches();
            if (checkPhone==true){
                customer.setPhoneNumber(Integer.parseInt(phoneNumber));
                check=false;
            }else {
                System.out.println("Phone number not valid !");
                check=true;
            }
        }
        check=true;
        System.out.println("Enter  type of customer :");
        customer.setTypeCustomer(scanner.nextLine());
        return customer;

    }

}
