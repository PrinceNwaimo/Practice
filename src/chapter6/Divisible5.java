package chapter6;

public class Divisible5 {
    public static void main(String[] args) {
        System.out.println("Divisor "+"  =   "  + isDivisible(45));

    }
    public static boolean isDivisible(int number){

        if (number % 5 == 0){
            return true;
        }

            return false;
    }
}
