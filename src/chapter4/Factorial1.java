package chapter4;

import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int total = 1;
        int innerTotal = 1;
        String compose = "";
        String capture = "";
        for (int factor = number; factor >= 1 ; factor--) {
            innerTotal = innerTotal * factor;
            compose = 1+"/"+innerTotal;

        }
        System.out.println("Measure is : " +compose);

        for (int fact = number; fact >= 1 ; fact--) {
            innerTotal = innerTotal/fact;

            capture = 1+"/"+ innerTotal;

            System.out.print(compose +" + "+ capture);


        }


        }
    }

