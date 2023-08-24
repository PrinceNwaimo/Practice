package loopExercises;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentsNumber = input.nextInt();
        String name =" ";
        int score =0;
        int highestScore =0;


        for (int number = 1; number <= studentsNumber; number++) {
                System.out.print("Student name: ");
                 name = input.next();
                System.out.print("Score: ");
                score = input.nextInt();


            if(score > highestScore)
                highestScore = score;



        }
        String best = name;
        System.out.println("Student with the highest score is: "+ best +"   " + highestScore);


    }

}
