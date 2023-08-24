package loopExercises;

public class Tuition {
    public static void main(String[] args) {
        double tuition = 10000.00;
        double rate = 0.05;
        double amount = tuition * rate;
        double total = 0;

        for (int year = 1; year <= 4; year++) {
            tuition = tuition + amount;
         tuition++;
         total = total + tuition;
            System.out.println("The amount is "+ tuition);
        }
        System.out.println("The total for four years is "+ total);


    }
}
