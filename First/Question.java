package First;


import java.util.Random;
import java.util.Scanner;

/* to store each question asked to get back later for checking
create 2 dimnensional array

for each question the dimension will relate the the i

q1 will mean saving the random interger to the array
answerarray[i][] = [rand1, rand2, questionType ]

how to print out
print 
"Q1 was "
*/


public class Question {
    private static int correctAnswersAdd = 0;
    private static int correctAnswersSub = 0;
    public void ShowQuestion() {
        Random rand = new Random();

        for (int i = 0; i < 4;) {

        int questionType = rand.nextInt(2);

        if (questionType == 0);{
                int addition1 = rand.nextInt(12) + 1;
                int addition2 = rand.nextInt(12) + 1;
                int correct = addition1 + addition2;
                Scanner inputAdd = new Scanner(System.in);
                System.out.println("What is " + addition1 + " + " + addition2 + "?");
                int answerAdd = Integer.parseInt(inputAdd.nextLine());
                if (answerAdd == correct); {
                    correctAnswersAdd = correctAnswersAdd +1;}
                i++;}

        if (questionType == 1);{
                int subtraction1 = rand.nextInt(12) + 1; //first randon number
                int subtraction2 = rand.nextInt(subtraction1) +1; //2nd rancom number which cant be more than the first
                int correctSub = subtraction1 - subtraction2; //correct answer
                //System.out.println(correctSub);//answer checking(testing)
                Scanner inputSub = new Scanner(System.in);//input
                System.out.printf("What is %d - %d?\n", subtraction1, subtraction2);//print line question
                int answerSub = Integer.parseInt(inputSub.nextLine());//converting input to int
                if (answerSub == correctSub){//checking if input == correct answer
                    correctAnswersSub = correctAnswersSub +1;}//if so +1 to correct answer in the subtraction section
                i++;} //for loop +1
        
            }
        }



    public static void checkAnswer() {

            System.out.printf("You have answered %d addition answers correct and %d subtraction answers correct", correctAnswersAdd, correctAnswersSub);


    }
    }
    

    
