package chapter2;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = (subtotal * gratuityRate)/100;
        double total = gratuity + subtotal;
        System.out.println("The gratuity is " + gratuity + "$ and the total is " + total + "$");

    }
}
