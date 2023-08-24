package chapter4;

import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int gcd = 1;
        int gcd2 = 2;

        while (gcd2 <= number1 && gcd2 <= number2){
            if (number1 % gcd2 == 0 && number2 % gcd2 == 0) {
                gcd = gcd2;
            }
                gcd2++;



        }
        System.out.println("Greatest Common Divisor for "+ number1 + " and "+ number2 +" is " + gcd);
    }
}
