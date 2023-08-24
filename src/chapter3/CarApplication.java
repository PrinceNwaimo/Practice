package chapter3;

public class CarApplication {
    public static void main(String[] args) {
       Car mercedes = new Car("G140","2020",1500.00);
       Car toyota = new Car("Spider","2013",500.00);

        System.out.printf("%s mercedes: $%.2f%n",mercedes.getModel(),mercedes.getPrice());
        System.out.printf("%s toyota: $%.2f%n",toyota.getModel(),toyota.getPrice());

        System.out.printf("%s mercedes: payment after discount $%.2f%n",mercedes.getModel(),mercedes.payment(0.05));
        System.out.printf("%s toyota: payment after discount $%.2f%n",toyota.getModel(),toyota.payment(0.07));
    }
}
