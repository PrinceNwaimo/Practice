package chapter2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your problem? :");
        System.out.print("Have you had this problem before(Yes/No): ");

       String response = input.nextLine();
       if (response.equals(true))
        System.out.println("Well, you have it again");


    }
}
