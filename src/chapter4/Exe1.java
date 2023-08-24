package chapter4;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles = 0;
        int gallons = 0;
        float mileage = 0;
        double total = 0;
        int tripCounter = 1;

        while (miles  != -1) {


            System.out.println("Enter the number of miles, press -1 to quit: ");
            miles = input.nextInt();
            System.out.println("Enter amount of gallons:  ");
           gallons = input.nextInt();
            mileage = miles / gallons;
            System.out.println(mileage + " Miles per gallons");

            total = total + mileage;
            System.out.println("Total = "+ total +" Miles per gallons" );

            if(miles == -1){
                System.out.println(total);
            }
        }
        double average = total/tripCounter;
        System.out.println("Average = "+ average +" Miles per gallons");

        }

        }

