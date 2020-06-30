package Models;

import java.util.Comparator;

public class Customer extends Services implements Comparator<Customer> {
    private  String name;
    private String birthday;
    private String gender;
    private int CMND;
    private int phoneNumber;
    private String email;
    private String typeCustomer;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, int CMND, int phoneNumber, String email, String typeCustomer) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.CMND = CMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String showInfor() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", birthday='" + birthday + '\'' +
                    ", gender='" + gender + '\'' +
                    ", CMND=" + CMND +
                    ", phoneNumber=" + phoneNumber +
                    ", email='" + email + '\'' +
                    ", typeCustomer='" + typeCustomer + '\'' +
                    '}';
    }

    @Override
    public int compare(Customer o1, Customer o2) {
        if (Integer.parseInt(o1.birthday)>Integer.parseInt(o2.getBirthday()))
            return 1;
        else if (Integer.parseInt(o1.birthday)<Integer.parseInt(o2.getBirthday()))
            return -1;
        else
            return 0;
    }
}
