package chapter4;

//4.38 (Factorial) The factorial of a nonnegative integer n is written as n! (pronounced “n factorial”)
//        and is defined for values of n greater than or equal to 1 as:
//        n! = n · (n – 1) · (n – 2) · … · 1
//        and for the n value 0 as:
//        n! = 1
//        For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
//        a) Write an application that reads a nonnegative integer and computes and prints its factorial.
//        b) Write an application that estimates the value of the mathematical constant e by using
//        the following formula. Allow the user to enter the number of terms to calculate.
//        c) Write an application that computes the value of ex
//        by using the following formula. Allow the user to enter the number of terms to calculate.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Factorial: ");
        int number = input.nextInt();
        int total = 1;
        for (int factor = number; factor >= 1 ; factor--) {
            total = total * factor;

            System.out.println(total);
        }
        System.out.println(number +  " Factorial is : " +total);



    }
}
