package Models;



public class Employee extends Services implements Comparable<Employee> {
    private String name;
    private String birthday;
    private String CMND;
    private int phoneNumber;
    private String email;
    private String virginity;
    private String position;
    private int salary;

    public Employee(String name, String birthday, String CMND,
                    int phoneNumber, String email, String virginity, String position, int salary) {
        this.name = name;
        this.birthday = birthday;
        this.CMND = CMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.virginity = virginity;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
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

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
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

    public String getVirginity() {
        return virginity;
    }

    public void setVirginity(String virginity) {
        this.virginity = virginity;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String showInfor() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", CMND='" + CMND + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", virginity='" + virginity + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        int result=this.getName().compareTo(o.getName());
        if (result==0){
            result=this.getBirthday().substring(7,10).compareTo(o.getBirthday().substring(7,10));
            if (result == 0) {
                result = this.getBirthday().substring(3, 5).compareTo(o.getBirthday().substring(3, 5));
                if (result == 0)
                    result = this.getBirthday().substring(0, 1).compareTo(o.getBirthday().substring(0, 1));
            }
        }
        return result;
    }
}
