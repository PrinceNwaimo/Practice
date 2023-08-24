package chapter2;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount and month: ");
        double amount = input.nextDouble();


        double value = amount *(1 + 0.00417);
        double newValue = (amount+ value) * (1 + 0.00417);
        double newValue1 = (amount+ newValue) * (1 + 0.00417);
        double newValue2 = (amount+ newValue1) * (1 + 0.00417);
        double newValue3 = (amount+ newValue2) * (1 + 0.00417);
        double newValue4 = (amount+ newValue3) * (1 + 0.00417);
        System.out.println("After the sixth month is "+newValue4 + "$");
    }
}
