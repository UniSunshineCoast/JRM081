package First;
import java.util.Random;
//import java.util.List;
//import java.util.Arrays;

public class Maths{

    int randint;

    String operation;
    public Maths(int a2, String c2, int b2, int d2) {
    }

    public  int getRandInt(int randint){
        Random rand = new Random(); 
        int upperbound = 12; //random number maximum
        return randint = rand.nextInt(upperbound);
    }

    public String getRandSymbol(){
        String res;
        int[] operators = {1, 2, 3 , 4};
        int rando = new Random().nextInt(operators.length);
        int rnd = operators[rando];
        if (rnd == 1);{
            res = new String("+");
        if (rnd == 2);{
            res = new String("-");}
        if (rnd == 3);{
            res = new String("/");}
        if (rnd == 4); {
            res = new String("*");}
        return res;}
    }

    int b;
    int a;
    String c;
    int d;

    /* public Maths(){
        this.a = a;//num1 = a, num2 =b, string c = maths op, int d = answer
        this.b = b;
        this.c = c;
        this.d = d;
    }
 */
    public String question(String[] args){
        Maths question = new Maths(a, c, b, d);
        a = getRandInt(randint);
        b = getRandInt(randint);
        c = getRandSymbol();
        d = checkAnswer(correctA);
        return ("what is " + question.a + " " + question.c + " " + question.b + " equal?");
    }    
    int correctA;

    public int checkAnswer(int correctA){
        if(c == "+"){
            correctA = b + a;
        }
        if (c == "-"){
            correctA  = b - a;
        }
        if (c == "%"){
            correctA = b / a;
        }
        if (c == "*"){
            correctA = b * a;
        }
        return correctA;
    }
}