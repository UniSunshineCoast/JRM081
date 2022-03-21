/**
 * This is a simple math game for grades 3-5.
 *
 * @author Jamie McGrath
 */

import java.util.Random;
import java.util.Scanner;

public class Question{
    public static void main(String[] args) {
        Random rand = new Random();
        int correctAnswers = 0;

        for (int i = 0; i < 9; i++) {

            int x = rand.nextInt(9) + 1;
            int y = rand.nextInt(9) + 1;

            int correct = x + y;

            System.out.println("What is " + x + "+" + y + "?");
            Scanner input = new Scanner(System.in);
            int answer = Integer.parseInt(input.nextLine());

            if (answer == correct) {
                correctAnswers = correctAnswers + 1;
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }

        if (correctAnswers >= 8) {
            System.out.printf("congratulations! you got %d out of 9\n", correctAnswers);
        } else {
            System.out.println("you got less than 8 correct!");

        }
        System.out.println("Times correct " + correctAnswers);

    }
}