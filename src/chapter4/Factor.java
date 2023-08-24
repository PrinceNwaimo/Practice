package chapter4;


import java.util.Scanner;

//(Find the factors of an integer) Write a program that reads an integer and displays
//        all its smallest factors in increasing order. For example, if the input integer is
//        120, the output should be as follows: 2, 2, 2, 3, 5.
public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for (int factor = 2; factor <= number/2; factor++) {
            if (number % factor == 0 && number / factor >=10)
                System.out.println(factor);

        }
    }
}
