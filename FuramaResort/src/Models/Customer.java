package Models;

import java.util.Comparator;

public class Customer extends Services implements Comparable<Customer> {
    private String name;
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
    //Method equals name and birthday
    @Override
    public int compareTo(Customer o) {
        int result = this.name.compareTo(o.getName());
        if (result == 0) {
            result = this.getBirthday().substring(7, 10).compareTo(o.getBirthday().substring(7, 10));

            if (result == 0) {
                result = this.getBirthday().substring(3, 5).compareTo(o.getBirthday().substring(3, 5));
                if (result == 0)
                    result = this.getBirthday().substring(0, 1).compareTo(o.getBirthday().substring(0, 1));
            }
        }
        return result;
    }
}

//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof  Customer){
//            if(this.name.equals(((Customer) obj).name)){
//                return true;
//            }
//        }
//        return false;
//    }


    //    @Override
//    public int compare(Customer o1, Customer o2) {
//        return o1.name.compareTo(o2.name);
//    }

