package easy;

import java.util.ArrayList;

public class ListGreeting {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Alice");
        names.add("Eve");

        for(String name : names) {
            System.out.println("Hello, " + name + "!");
        }
    }
}
