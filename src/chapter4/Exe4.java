package chapter4;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount earned:  ");
        double earnings = input.nextDouble();

        if(earnings <= 30000){
            double tax = earnings * 0.15;
            System.out.println("Total tax is : "+ tax);
        } else if (earnings >= 30000) {
            double tax = earnings * 0.20;
            System.out.println("Total tax is : "+ tax);

        }

    }
}
