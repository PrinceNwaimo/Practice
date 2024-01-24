package chapter6;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second  integer: ");
        int number2 = input.nextInt();
        System.out.println("The greatest common divisor for " + number1 + "and "+ number2 + "is" + gcd(number1, number2));
    }

    public static int gcd(int number1, int number2){
      int gcd = 0;
      int k = 2;

      while(k<= number1 && k <= number2){
          if(number1 % k == 0 && number2 % k == 0)
              gcd = k;
          k++;
      }
      return gcd;

    }
}
