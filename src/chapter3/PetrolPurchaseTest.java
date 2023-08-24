package chapter3;

import java.util.Scanner;

public class PetrolPurchaseTest {
    public static void main(String[] args) {
        PetrolPurchase car1 = new PetrolPurchase("Lagos", "NPK", 10, 100.00, 0.05);
        PetrolPurchase car2 = new PetrolPurchase("Aba", "APK", 50, 100.00, 0.10);


        System.out.printf("%s Location: %s%n", car1.getLocation(), car1.getTypeOfPetrol(), car1.getPrice(), car1.getQuantity());
        System.out.printf("%s Location: %s%n%n", car2.getLocation(), car2.getTypeOfPetrol(), car2.getPrice(), car2.getQuantity());

        car1.getPurchaseAmount();
        System.out.println("Amount to pay $" + car1.getPurchaseAmount());


        car2.getPurchaseAmount();
        System.out.println("Amount to pay $" + car2.getPurchaseAmount());

    }
}