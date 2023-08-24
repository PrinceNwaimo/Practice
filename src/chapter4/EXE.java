package chapter4;

public class EXE {
    public static void main(String[] args) {
        for (int i = 100; i >=1 ; i--) {

            if (i == 55 || i == 50)
                continue;
            System.out.println(i);
        }
        System.out.println("    ");

        for (int i = 100; i >= 2 ; i-=2) {
            System.out.println(i);
        }
    }
}
