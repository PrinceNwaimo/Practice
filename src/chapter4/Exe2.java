package chapter4;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        while (count !=-1){
            System.out.println("Enter the number of miles, press -1 to quit: ");
            count = input.nextInt();

        System.out.println("Account Number: ");
        int accountNumber = input.nextInt();
        System.out.println("Balance at the beginning of month: ");
        int balance = input.nextInt();
        System.out.println("Total items charged by customers: ");
        int totalItems = input.nextInt();
        System.out.println("Total credits: ");
        int totalCredits = input.nextInt();
        System.out.println("Allowed credit");
        int allowedCredit = input.nextInt();

        int newBalance = balance + totalItems - totalCredits;
        System.out.println("New balance is "+ newBalance);
            if (count == -1){
                System.out.println(newBalance);
            }

        if (newBalance < allowedCredit){
            System.out.println("New balance is "+ newBalance);
        }
        else {
            System.out.println("Credit limit exceeded");

        }

        }

    }


}
