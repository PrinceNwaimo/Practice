package chapter4;

public class Exe11 {
    public static void main(String[] args) {
        int row = 10;

        while (row >= 1){
            int column = 5;

                while(column >= 1){
                    System.out.print(row % 2 == 0 ? " X " : " O ");
                    --column;
                }
                --row;
            System.out.println();
            }
        }
    }

