package First;
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class Maths{
    
    public  int getRandInt(){
        Random rand = new Random(); 
        int upperbound = 12; //random number maximum
        int int_random = rand.nextInt(upperbound); //random number under maximum
        return int_random + 1; //return number
    }

    public String getRandSymbol(){
        List<String> givenList = Arrays.asList("+");//, /* "-", "x", "%" */); //create array with each of the 4 maths operators
        Random rSymbol = new Random();
        int numberOfElements = 1; //number of operators
        for(int i = 0; i < numberOfElements;){ //create for loop
            int randomIndex = rSymbol.nextInt(givenList.size()); //random index, Random variable into the lists size
            String operation = givenList.get(randomIndex); //assigning said index to a new variable
            return operation; //return given operator
        }
        return null;    
    }

    //public void checkAnswer(){

        //if maths symbol = (+,-,x,%) do the appropriate maths
        //int_random (apply maths) int_rand 
        //== Answer
    }
