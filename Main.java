import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] questionBank = {
            new String[]{"If you are lost on which directory you are in, how can you figure it out with one single command that is 3 letters long?", "pwd"},
            new String[]{"Make a directory called fruits", "mkdir fruits"}
        };

        for(int i = 0; i < questionBank.length; i++){
            boolean answerIsCorrect = false;

            while(!answerIsCorrect){
            System.out.println(questionBank[i][0]);
                //Print terminal area
                System.out.print("> ");

                String userInput = scanner.nextLine();

                if(userInput.equals("exit")){ break; }
                
                if(questionBank[i][1].equals(userInput)){
                    answerIsCorrect = true;
                } else {
                    System.out.println("Wrong");
                    continue;
                }
            }
            //Once it is correct
            System.out.println("CORRECT");
        }

        //This runs once the questions are over.
        System.out.println("I hope you liked this Linux learning game.  Leave any comments on how you think this project can be improved.");
    }
}
