package ifStatement;

import java.util.Scanner;

public class eg1 {
    public static void main(String[] args) {
        assign();
        scoreCal();
    }

        private static void assign(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
       int Y = input.nextInt();
       int X = 0;
       if (Y > 0)
           X= 1;
           System.out.println("X = "+X);

    }
   private static void scoreCal(){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter score: ");
       int score = input.nextInt();

       int pay = 10;
       double pay1 = 0.0;
       double num = pay * 0.03;
       if(score > 90)
           pay1 = pay + num;
       System.out.println(pay1);



    }
}
