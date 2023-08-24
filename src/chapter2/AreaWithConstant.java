package chapter2;

import java.util.Scanner;

public class AreaWithConstant {
    public static void main(String[] args) {
        final double pi = 3.142;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double radius = input.nextDouble();
        double area = radius * radius * pi;
        System.out.println("The area for the circle with radius "+radius +"cm is :" + area);


    }
}
