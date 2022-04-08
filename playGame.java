package First;

import java.util.ArrayList;

public class playGame{

    
    String[] q;
    int score;

    public void setscore(){
        score++;
    }

    static int storage[];
    
    public void initGame(String[] args){ //starts game
        ArrayList<String[]> qArray = new ArrayList<String[]>();//create array to store question in
        for (int x = 0; x < 9; x++);{ //first for loops and first array for quesitons and correct answers
            Maths quest = new Maths();
            quest.question(q);

                qArray.add(q);
            System.out.println(qArray);
            }
        }

        /* for (int x = 0; x < 9; x++){
            System.out.print(qArray[x]);
            Scanner myScan = new Scanner(System.in); //scanner so player can answer
            int answer = myScan.nextInt();
            System.out.println("you have answered: " + answer);//print their answer
            if (answer == storage[x]){
                correct();
            }else {
                incorrect();} */
    

    public void correct(){
        System.out.print("Correct!");
            setscore();
            System.out.println("Current Score: " + score);
    }
    
    public void incorrect(){
        System.out.println("Incorrect");
        System.out.println("Current Score: " + score);
    }
}
