/*
Whay data structure do I want to use to store th questions?  A array of Strings. 
*/
import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Lets make the array of questions. 
        String[][] questionBank = {
            new String[]{"If you are lost on which directory you are in, how can you figure it out with one single command that is 3 letters long?", "pwd"},
            new String[]{"Make a directory called fruits", "mkdir fruits"}
        };

        String userInput;

        for(int i = 0; i < questionBank.length; i++){
            //This will be used in the conditional statement when choosing wether or not we are moving on Or the question is repeated.
            Bool answerIsCorrect = false;
            
            if(userInput.equals("exit")){ break; }
            while(!answerIsCorrect){
                //While the answer is not correct this is where the input, reply loop is.
                //Print question
                System.out.println(questionBank[i][0]);
                //Print terminal area
                System.out.print("> ");
                //Grab user string and compare
                userInput = scanner.nextLine();
                //Comparison
                if(questionBank[i][1].equals(userInput)){
                    answerIsCorrect = true;
                } else {
                    System.out.print("Wrong > "));
                    continue
                }
            }
            //Once it is correct
            System.out.println("CORRECT");
        }

        //This runs once the questions are over.
        System.out.println("I hope you liked this Linux learning game.  Leave any comments on how you think this project can be improved.");
    }
}
