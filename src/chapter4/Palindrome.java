package chapter4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        String number = input.nextLine();

        int firstDigit = 0;
        int lastDigit = number.length() - 1;

        boolean isPalindrome = true;

        while (firstDigit < lastDigit) {
            if (number.charAt(firstDigit) != number.charAt(lastDigit)) {
                isPalindrome = false;
                break;
            }

        firstDigit++;
        lastDigit--;
    }


        if (isPalindrome){
            System.out.println(number + " is a palindrome");
        }
        else{
            System.out.println(number + "is not a palindrome");
        }

    }
}
