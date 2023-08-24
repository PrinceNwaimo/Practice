package chapter2;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side1 = x1*(y2-y3);
        double side2 = x2 *(y3-y1);
        double side3 = x3 *(y1- y2);

        double finalSide = (side1 + side2 + side3)/2;
        double area1 = finalSide*((finalSide-side1)*(finalSide-side2)*(finalSide-side3));
        System.out.println("The area of the triangle is " + finalSide);
    }
}