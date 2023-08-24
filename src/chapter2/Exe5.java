package chapter2;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 :");
        int number = input.nextInt();
        int number1 = number / 10;
        int number2 = number % 10;
        int number3 = number1 / 10 ;
        int number4 = number1 % 10;
        int number5 = number3 / 1;
        int total = number2+ number4 + number5;
        System.out.println("The sum of the digits is " + total);
    }
}
