package loopExercises;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0:");
        int number = input.nextInt();
        int positive = 0;
        int negative = 0;
        double total = 0;
        double average = 0;
        int count = 0;
        while (number != 0) {
            if (number < 0)
                negative++;
            if (number > 0)
                positive++;
            total = total + number;
            count++;
            System.out.print("Enter an integer, the input ends if it is 0:");
            number = input.nextInt();
        }
        average = total/ count;
        System.out.println("The number of positives is : "+ positive);
        System.out.println("The number of negatives is : "+ negative);
        System.out.println("The total is : "+ total);
        System.out.println("'The average is :"+ average);
    }
}