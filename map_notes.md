```
package net.javaguides.corejava.java9;

import java.util.Map;

public class ImmutableMapExample {

    public static void main(String[] args) {
        Map < String, String > fruits = Map.ofEntries(
            Map.entry("1", "Banana"),
            Map.entry("2", "Apple"),
            Map.entry("3", "Mango"),
            Map.entry("4", "Orange"));

        System.out.println(fruits);
    }

}
```
