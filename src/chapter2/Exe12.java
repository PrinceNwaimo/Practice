package chapter2;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        double side2 =  (3 * 1.732050807568877)/2;
        double area = side2 * Math.pow(side,2);

        System.out.println("The area of the hexagon is " + area);
    }
}
