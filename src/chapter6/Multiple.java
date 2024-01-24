package chapter6;

public class Multiple {
    public static void main(String[] args) {
        System.out.println("Number is = "+ isMultiple(5, 46));
    }
    public static boolean isMultiple(int number1, int number2){
        if(number2 % number1 == 0){
            return true;
        }
        return false;

    }
}
