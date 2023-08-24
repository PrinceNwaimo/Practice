package ifStatement;

import java.util.Scanner;

public class Eg3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if(number1 < number2) {
            int swap = number1;
            number1 = number2;
            number2 = swap;
        }
        int difference = number1- number2;
        System.out.println(number1 + "-" +number2+ " is " +difference);

    }
}
