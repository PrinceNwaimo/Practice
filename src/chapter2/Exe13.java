package chapter2;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed (>=) in miles per hour: ");
        int speed = input.nextInt();
        double windChill1 = (35.74 + 0.6215*temperature);
        double  windChill2 = (35.75 * Math.pow(speed,0.16));
        double windChill3 = (0.4275 * temperature * Math.pow(speed,0.16));

        double finalWIndChill = windChill1 - windChill2 + windChill3;
        System.out.println("The wind chill index is " + finalWIndChill);
    }
}
