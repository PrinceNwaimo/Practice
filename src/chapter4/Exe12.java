package chapter4;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five letter integer: ");
        int number = input.nextInt();
        if(isPalindrome(number)){
            System.out.println("Number is a Palindrome");

        }
        else{
            System.out.println("Number is not a palindrome");
        }

    }

    private static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        return originalNumber == reversedNumber;

    }

}

