package chapter4;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int smallest = 1000;
        int second_smallest = 1000;

        for (int count = 0; count < 5; count++) {
            System.out.println("Enter the number: ");
            int number = input.nextInt();

            if(number < smallest){
                second_smallest = smallest;
                smallest = number;

            } else if (number < second_smallest && number > smallest) {
                second_smallest = number;

            }

        }
        System.out.println("Smallest number is: "+smallest);
        System.out.println("Second smallest is: "+second_smallest);
    }
}
