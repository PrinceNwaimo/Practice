package chapter4;

import java.util.Scanner;

public class Exe7 {

        public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

            int largest = 0;
            int secondLargest = 0;
            for (int counter = 1; counter <= 10; counter++) {
                System.out.print("Enter number : ");
               int number = input.nextInt();


                if (number > largest) {
                    secondLargest = largest; // Update secondLargest before updating largest
                    largest = number;
                } else if (number > secondLargest && number < largest) {
                    secondLargest = number;


                }
//                if (number > secondLargest && secondLargest < largest){
//                    secondLargest = largest;
//                }



            }
            System.out.println("The largest is " +largest);
            System.out.println("The second largest is "+secondLargest);

        }
    }



