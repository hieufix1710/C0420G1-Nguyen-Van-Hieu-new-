package Controllers;

import Models.Customer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Film4D {
    private Queue<Customer> queue;
    private int ticket=10;

    public Film4D(Queue<Customer> queue) {
        this.queue = queue;
    }

    public Film4D() {
    }

    public Queue<Customer> getQueue() {
        return queue;
    }


    public  void printListQueue(){
        getQueue();

    }
    public void  readCSV(){
        FileReader fileReader= null;
        queue=new LinkedList<>();

        try {
            fileReader = new FileReader("src/Data/Customer.csv");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer;
            int count=0;

            while ((line=bufferedReader.readLine())!=null) {
                temp=line.split(",");
                customer=new Customer(temp[0],temp[1],temp[2],Integer.parseInt(temp[3]),Integer.parseInt(temp[4]),temp[5],temp[6]);
                queue.add(customer);
                ticket--;
                count++;  //bien dem luot ve da ban
            }
            for (int i = 0; i <count ; i++) {
                System.out.println(queue.poll().showInfor());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public static void main(String[] args) {
        Film4D film4D=new Film4D();
        film4D.readCSV();

    }
}
