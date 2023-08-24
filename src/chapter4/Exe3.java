package chapter4;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of persons: ");
        int number = input.nextInt();
        int count = 0;
        int person = 1;
        while (count != -1) {

            count = input.nextInt();

            System.out.println("Sales person" + person);
            person++;
            System.out.println("Weekly fixed pay: ");
            int pay = input.nextInt();
            System.out.println("list amount of items sold: ");
            int items = input.nextInt();

            int total = 0;
//            while (items != 0) {
//                total = total + items;
//            }
            double commission = items * 0.09;
            double totalPay = pay + commission;
            System.out.println("Payment for the week = " + totalPay);
        }
    }
}
