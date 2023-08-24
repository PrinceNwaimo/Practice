package loopExercises;

public class Exe2 {
    public static void main(String[] args) {
        System.out.println("Kilograms " + "Pounds" + "============" + "Pounds" + "  Kilograms ");
        System.out.print(kiloMea(5)+" ========" +poundMea(2));
    }
        private static int kiloMea(int number) {
            for (int kilogram = 1; kilogram < 200; kilogram++) {
                if (kilogram % 2 != 0)
                    System.out.println(kilogram + "         " + kilogram * 2.2);
            }
            return number;
        }

        private static int poundMea(int number) {
                for (int pound = 20; pound < 515; pound++) {
                    if (pound % 2 != 0)
                        System.out.println(pound + "     " + pound * 0.4545);
                }
                return number;
            }

    }

