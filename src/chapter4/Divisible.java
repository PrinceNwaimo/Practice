package chapter4;

//Find numbers divisible by 5 and 6) Write a program that displays all the numbers
//        from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
//        separated by exactly one space.
public class Divisible {
    public static void main(String[] args) {
        for (int number = 100; number <1000 ; number++) {
            if(number % 5 == 0 && number % 6 == 0)
                System.out.println(number);

        }
    }
}
