package chapter6;

public class Hypotenuse {
    public static void main(String[] args) {
        System.out.println("Hypotenuse of triangle " + hypotenuse(5,12));
    }
    public static double hypotenuse(double side1, double side2){
     double number1 = Math.pow(side1, 2);
     double number2 = Math.pow(side2,2);

     double total = Math.sqrt(number1 + number2);

     return total;

    }
}
