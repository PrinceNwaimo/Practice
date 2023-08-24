package chapter6;

import java.security.SecureRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        for (int counter = 0; counter <= 20 ; counter++) {

            int face = 1 + random.nextInt(6);
            System.out.printf("%d ",face);

            if (counter % 5 == 0)
                System.out.println();

        }
    }
}
