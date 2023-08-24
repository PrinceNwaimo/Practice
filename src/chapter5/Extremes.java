package chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of numbers: ");
        int number = input.nextInt();
        int highest = 0;
        int lowest = 100;

        for (int count = 1; count <= number ; count++) {
            System.out.print("Enter numbers: ");
             int number1 = input.nextInt();

            if(number1 > highest)
                highest = number1;

            if(number1 < lowest)
                lowest = number1;

        }
        System.out.println(highest);
        System.out.println(lowest);
        System.out.println(highest + lowest);
    }
}
