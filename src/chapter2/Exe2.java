package chapter2;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        final double pie = 3.142;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");

        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * pie;
        double volume = area * length;
        System.out.println("The area is : " + area);
        System.out.println("The volume is : " + volume);
    }
}
