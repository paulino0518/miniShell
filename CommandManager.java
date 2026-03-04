package miniShell;

import java.util.function.Consumer;
import java.util.Map;
import static java.util.Map.entry;

public class CommandManager {
    
    Map<String, Consumer<String>> commands = Map.ofEntries(
        entry("hello", c -> System.out.println("Hello world")),
        entry("ls", c -> System.out.println("ls needs to be made"))
    );

    public void getCommand(String command){
        if(!commands.containsKey(command)){
            System.out.println("Invalid command");
        } else {
            commands.get(command);
            //.accept(command); after we have made it multi item input
        }
    }

}
