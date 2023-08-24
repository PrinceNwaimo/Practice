package chapter5;

public class Three {
    public static void main(String[] args) {
     int total = 0;
        for (int count = 1; count <= 30 ; count++) {

            if(count % 3 == 0)

            System.out.println(count);
            total = total + count;




        }
        System.out.println("Total is " + total);
    }
}
