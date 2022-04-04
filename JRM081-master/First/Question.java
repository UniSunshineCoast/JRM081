package First;

public class Question extends Maths{
    static String Symbol;
    static int value1;
    static int value2;
    
    public void setValue1(int num){ //allows variables to be used inside the ShowQuestion Method and to be printed later on.
        Question.value1 = num;
    }

    public void setValue2(int num){
        Question.value2 = num;
    }

    public void setSymbol(String Sym){
        Question.Symbol = Sym;
    }

    public void ShowQuestion() {
        //get values for the each part of the question
        Maths A = new Maths();
            int value1 = A.getRandInt(); 
            Question obj = new Question();
            obj.setValue1(value1);

        Maths B = new Maths();
            int value2 = B.getRandInt(); //calls to get a random int
            Question obj2 = new Question();
            obj2.setValue2(value2);//reassigns value1 to said random int, allows for said number to be printed.

        //get mathmatic operator
        Maths O = new Maths();
            String operation = O.getRandSymbol(); //calls a random symbol
            Question obj3 = new Question();
            obj3.setSymbol(Symbol);

        /* if (operation == "-"){
            if (value2 > value1){
                @Override //override 
                int upperbound = value1 - 1;
                Maths C = new Maths();
                int value3 = C.getRandInt();
                System.out.printf("What is " + value1 + " %s "+ value3 + " equal?", operation);
            }
        } */

        System.out.printf("What does " + value1 + " %s "+ value2 + " equal?%n", operation); //Question print
        }
    
        //potential idea to make subtraction easier
            //if num1 is smaller than num2, rerun getRandInt}
   

    public static int checkAnswer() { // Check answer takes the two random values and (mathmatic equation) them together, and prints answer
        int answer = value1 + value2;
        //System.out.printf("%n%s", answer);
        return answer;
        }   
    } 

    
