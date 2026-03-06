import java.util.Scanner;
public class Main{

    

    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        //I want to have a loop to run the program and if you type quit it will exit or whatever command Linux uses. 

        CommandManager commandManager = new CommandManager();

        //I want to iterate question for question
        int numberOfQuestions = 2;

        for(int i = 0; i < numberOfQuestions; i++){
            //Call the question 
            String userInput = scanner.nextLine();
            System.out.println(commandManager.getQuestion(i)[0]);
            if(userInput.equals(commamdManager.getQuestion(i)[1])){}
            
            
            
        }
    }

}