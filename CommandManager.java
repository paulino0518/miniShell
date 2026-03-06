package miniShell;

import java.util.function.Consumer;
import java.util.Map;
import static java.util.Map.entry;
import java.util.Scanner;

public class CommandManager {
    //Sanner scanner = new Scanner(System.in);

    Map<int, Consumer<String>> commands = Map.ofEntries(
        entry(0, c -> {
            String question = "Change directory to the parent of your current directory.";
            string answer = "cd ..";
            
            return [question, answer];
            //How will we get the question? pass the user input ane compare it to answer. 
            
        }),
        entry("ls", c -> System.out.println("ls needs to be made"))
    );

    public void getQuestion(String command){
        if(!commands.containsKey(command)){
            System.out.println("Invalid command");
        } else {
            commands.get(command).accept(;
            
        }
    }

}
