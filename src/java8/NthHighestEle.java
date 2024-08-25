package java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class NthHighestEle {

    public static void main(String[] args) {
        // Create a HashMap to store names and random integers
        Map<String, Integer> nameToRandomNumber = new HashMap<>();

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Add 10 name-integer pairs to the HashMap
        nameToRandomNumber.put("Alice", 1000); // Random number between 0 and 99
        nameToRandomNumber.put("Bob", 500);
        nameToRandomNumber.put("Charlie",1800);
        nameToRandomNumber.put("Gulbi",1800);
        nameToRandomNumber.put("Frank", 1700);
        nameToRandomNumber.put("Frankie", 1700);
        nameToRandomNumber.put("Ivy", 600);
        nameToRandomNumber.put("Rubi", 1900);



        String stringIntegerEntry = nameToRandomNumber.entrySet().stream().sorted(Comparator.comparing(s -> s.getValue())).skip(nameToRandomNumber.size()-2).findFirst().get().getKey();
        System.out.println(stringIntegerEntry);
    }
}
