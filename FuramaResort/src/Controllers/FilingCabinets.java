package Controllers;

import Models.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets {
    private Stack<Employee> stack;

    public FilingCabinets() {
    }

    public FilingCabinets(Stack<Employee> stack) {
        this.stack = stack;

    }
    //This method searching employee in filling cabinets.
    public void find(String name){
        try {
            stack=new Stack<>();
            FileReader fileReader=new FileReader("src/Data/Employee.csv");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;
            while ((line=bufferedReader.readLine())!=null){
                temp=line.split(",");
                employee=new Employee(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), temp[4], temp[5], temp[6], Integer.parseInt(temp[7]));
                stack.add(employee);
            }
            for (int i = 0; i <stack.size() ; i++) {

                if (stack.get(i).getName().equals(name)){
                    System.out.println(stack.get(i).showInfor());
                    break;
                }
                else {
                    System.out.println("File not found !");
                    break;

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FilingCabinets filingCabinets=new FilingCabinets();
        System.out.println("Enter name of element need find :");
        Scanner scanner=new Scanner(System.in);
        filingCabinets.find(scanner.nextLine());
    }
}
