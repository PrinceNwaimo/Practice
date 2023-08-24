package chapter4;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int largest = 0;
        for (int counter = 1; counter <= 10; counter++) {
            System.out.print("Enter number : ");
            number = input.nextInt();


            if (number > largest) {
                largest = number;

            }


        }
        System.out.println("The largest is " +largest);

            }
        }

