package chapter5;

public class PrimeNumbers2 {
    public static void main(String[] args) {
        int numberOfPrimeNumbers = 0;
        for (int counter = 1; counter <=100 ; counter++) {
            boolean prime = false;
            for (int factor = 2; factor <= counter/2; factor++) {
                if(counter % factor == 0) {
                    prime = true;
                    break;
                }
                if(!prime) {
                    System.out.println("prime number is : "+counter);

                }
                numberOfPrimeNumbers++;


            }
            System.out.println(numberOfPrimeNumbers);

        }

    }
}
