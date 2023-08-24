package chapter2;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5)* celsius + 32;
        System.out.println(celsius+ " Celsius is Fahrenheit  " + fahrenheit);
    }
}
