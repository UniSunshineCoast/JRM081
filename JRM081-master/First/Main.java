/**
 * This is a simple math game for grades 3-5.
 *
 * @author Jamie McGrath
 */


package First;

import java.util.Scanner;

public class Main{
    private static int score = 0;

    public static void setscore(){
        Main.score = score+1;}

    public static void main(String[] args) {
        Main.playMultipleGames();}

    public static void PlayGame() { //plays game
        Question q1 = new Question(); //brings new question
            q1.ShowQuestion();
        Scanner myScan = new Scanner(System.in); //scanner so player can answer
            int answer = myScan.nextInt();
        System.out.println("you have answered: " + answer);//print their answer
        int check = Question.checkAnswer();
            if (check == answer){ // check their answer to the correct answer if yes, score++
                System.out.print("Correct!");
                setscore();
                System.out.println("Current Score: " + score);
            }else { //else print inorrect
                System.out.println("Incorrect :(");
                System.out.println("Current Score: " + score);
            }
        }

    
    public static void playMultipleGames(){
        for (int i = 0; i < 5; i++){
            Main.PlayGame();}
    }
    
}