package chapter4;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();


        for ( int factor = 2; factor <= number/2 ; factor++) {
            if(number % factor == 0 )

            System.out.println(factor);

        }




    }
}
