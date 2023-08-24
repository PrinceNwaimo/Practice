package chapter2;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes : ");
        int minutes = input.nextInt();
        int years= minutes / 525600;
        int left = minutes % 525600;
        int days = left/1440;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days+" days");
    }
}
