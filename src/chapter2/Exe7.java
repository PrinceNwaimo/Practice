package chapter2;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT : ");
        int time = input.nextInt();

        Long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes/60;
        long currentHour = totalHours % 24;
        long recentCurrentHour = currentHour + time;

                System.out.println("Current time is " + recentCurrentHour + ":" + currentMinute + ":" + currentSecond + "GMT");

    }
}
