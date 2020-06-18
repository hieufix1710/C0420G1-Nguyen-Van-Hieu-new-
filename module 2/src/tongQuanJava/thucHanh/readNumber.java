package tongQuanJava.thucHanh;

import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number need reading");
//        int number = scanner.nextInt();
//        switch (number){
//                case 1:
//                System.out.println("One");
//                break;
//                case 2:
//                System.out.println("Two");
//                break;
//                case 3:
//                System.out.println("Three");
//                break;
//                case 4:
//                System.out.println("Four");
//                break;
//                case 5:
//                System.out.println("Five");
//                break;
//                case 6:
//                System.out.println("Six");
//                break;
//                case 7:
//                System.out.println("Seven");
//                break;
//                case 8:
//                System.out.println("Eight");
//                break;
//                case 9:
//                System.out.println("Nine");
//                break;
//                case 10:
//                    System.out.println("Ten");
//                    break;
//                default:
//                System.out.println("Invalid Input");
//        }
        String number=scanner.nextLine();
        String num1,num2=null,num3=null;
         num1=number.substring(0,1);
               if(num2==""){
                   switch (num1) {
                       case "0":
                           num1="zero";
                           break;
                       case "1":
                           num1="One";
                           break;
                       case "2":
                           num1="Two";
                           break;
                       case "3":
                           num1="Three";
                           break;
                       case "4":
                           num1="Four";
                           break;
                       case "5":
                           num1="Five";
                           break;
                       case "6":
                           num1="Six";
                           break;
                       case "7":
                           num1="Seven";
                           break;
                       case "8":
                           num1="Eight";
                           break;
                       case "9":
                           num1="Nine";
                           break;
                       case "10":
                           num1="Ten";
                           break;
                           case "11":
                           num1="Eleven";
                           break;
                           case "12":
                           num1="Twelve";
                           break;
                           case "13":
                           num1="Thirteen";
                           break;
                           case "14":
                           num1="Fourteen";
                           break;
                           case "15":
                           num1="Fiveteen";
                           break;
                           case "16":
                           num1="Sixteen";
                           break;
                           case "17":
                           num1="Seventeen";
                           break;
                           case "18":
                           num1="Eighteen";
                           break;
                       case "19":
                           num1="Nineteen";
                           break;
                       default:
                           System.out.println("Invalid Input");
                   }

               } else {
                   switch (num1){
                       case "0":
                           System.out.println("Not Valid");
                           break;
                       case "1":
                           num1="One Hundred";
                           break;
                           case "2":
                           num1="Two Hundred";
                           break;
                           case "3":
                           num1="Three Hundred";
                           break;
                           case "4":
                           num1="Four Hundred";
                           break;
                           case "5":
                           num1="Five Hundred";
                           break;
                           case "6":
                           num1="Six Hundred";
                           break;
                           case "7":
                           num1="Seven Hundred";
                           break;
                           case "8":
                           num1="Eight Hundred";
                           break;
                           case "9":
                           num1="Nine Hundred";
                           break;
                   }
               }
         num2=number.substring(1,2);
        if (num3==""){
            switch (num2) {
                case "0":
                    num1="Twently";
                    break;
                case "1":
                    num2="One ";
                    break;
                case "2":
                    num2="Two";
                    break;
                case "3":
                    num2="Three";
                    break;
                case "4":
                    num2="Four";
                    break;
                case "5":
                    num2="Five";
                    break;
                case "6":
                    num2="Six";
                    break;
                case "7":
                    num2="Seven";
                    break;
                case "8":
                    num2="Eight";
                    break;
                case "9":
                    num2="Nine";
                    break;
                default:
                    System.out.println("Invalid Input");
            }

        }
        else {
            switch (num2){
                case "0":
                    num2="";
                    break;
                case "1":
                    num1="One";
                    break;
                case "2":
                    num1="Two";
                    break;
                case "3":
                    num1="Three";
                    break;
                case "4":
                    num1="Four";
                    break;
                case "5":
                    num1="Five";
                    break;
                case "6":
                    num1="Six";
                    break;
                case "7":
                    num1="Seven";
                    break;
                case "8":
                    num1="Eight";
                    break;
                case "9":
                    num1="Nine";
                    break;
            }
        }

         num3=number.substring(2,3);
        switch (num3) {
            case "":
                num3="";
                break;
            case "1":
                num3=" or One";
                break;
            case "2":
                num3=" or Two";
                break;
            case "3":
                num3=" or Three";
                break;
            case "4":
                num3=" or Four";
                break;
            case "5":
                num3=" or Five";
                break;
            case "6":
                num3=" or Six";
                break;
            case "7":
                num3=" or Seven";
                break;
            case "8":
                num3=" or Eight";
                break;
            case "9":
                num3=" or Nine";
                break;
            default:
                System.out.println("Invalid Input");
        }
        for (int i=0;i<1;i++){

                System.out.printf(num1+num2+num3);



        }
    }
}
