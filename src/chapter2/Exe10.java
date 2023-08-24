package chapter2;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches : ");

        double height = input.nextDouble();

        double weightInPound = weight * 0.45359237;
        double heightInInches = height * 0.0254;
        double BMI = weightInPound/(heightInInches * heightInInches);

        System.out.println("BMI is " + BMI);
    }
}
