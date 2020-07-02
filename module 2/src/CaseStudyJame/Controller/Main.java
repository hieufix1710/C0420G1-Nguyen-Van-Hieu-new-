package CaseStudyJame.Controller;

import CaseStudyJame.Models.Dictionary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public String search(String keyWord) {
        try {
            List<Dictionary> list = new ArrayList<>();
            FileReader fileReader = new FileReader("src/CaseStudyJame/Data/data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Dictionary dictionary;

            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split("-");
                dictionary = new Dictionary(temp[0], temp[1], temp[2]);
                list.add(dictionary);
            }
            for (Dictionary a : list) {
                if (keyWord.equals(a.getEnglish())) {
                    return "nghĩa là : " + a.getVietnamese();
                }
                if (keyWord.equals(a.getVietnamese())) {
                    return "is mean : " + a.getEnglish();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "-English dictionary is not included in the dictionary !" + "\n" + "-Từ bạn nhập không có trong từ điển !";
    }

    public String getDescription(String keyWord) {
        try {
            List<Dictionary> list = new ArrayList<>();
            FileReader fileReader = new FileReader("src/CaseStudyJame/Data/data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Dictionary dictionary;

            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split("-");
                dictionary = new Dictionary(temp[0], temp[1], temp[2]);
                list.add(dictionary);
            }
            for (Dictionary a : list) {
                if (keyWord.equals(a.getEnglish())) {
                    return a.getVietnamese() + "- Description : " + a.getDescription();
                }
                if (keyWord.equals(a.getVietnamese())) {
                    return a.getEnglish() + "- Description : " + a.getDescription();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "-English dictionary is not included in the dictionary !" + "\n" + "-Từ bạn nhập không có trong từ điển !";

    }

    public static void main(String[] args) {
        Main main = new Main();
        boolean check=true;
        while (check) {
            System.out.println("MENU");
            System.out.println("1.Searching ");
            System.out.println("2.Get description of key word : ");
            int choose = new Scanner(System.in).nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Enter key word need searching down here :");
                    String str = new Scanner(System.in).nextLine();
                    System.out.println(main.search(str.toLowerCase()));
                    check=true;
                    break;
                case 2:
                    System.out.println("Enter key word need searching down here :");
                    String str2 = new Scanner(System.in).nextLine();
                    System.out.println(main.getDescription(str2.toLowerCase()));
                    check=true;
                    break;
                default:
                    System.out.println("Incorrect operation !");
                    check=true;


            }
        }


    }
}
