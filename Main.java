package com.gabebraden;

// Java program to demonstrate working of Map interface
import java.util.*;
public class Main {

    public static void main(String[] args) {
        {
            HashMap<String, String> dictOfTerms =
                    new HashMap<>();

            dictOfTerms.put("ritendo", "suddenly slower, held back");
            dictOfTerms.put("stringendo", "pressing, becoming faster");
            dictOfTerms.put("bewegt", "moving");
            dictOfTerms.put("sehr", "very");
            dictOfTerms.put("schnell", "fast");
            dictOfTerms.put("calando", "becoming slower, softer");
            dictOfTerms.put("mässig", "moderate");
            dictOfTerms.put("comodo", "at a comfortable, easy tempo");
            dictOfTerms.put("largamente", "broadly");
            dictOfTerms.put("allargando", "broading, becoming slower");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Type press enter to start the quiz, to stop at any time, type abort: ");
            String ans = scanner.nextLine();

            while(!(ans.equals("abort"))) {
                Random random = new Random();
                List<String> keys = new ArrayList<>(dictOfTerms.keySet());
                String randomKey = keys.get( random.nextInt(keys.size()) );
                String value = dictOfTerms.get(randomKey);

                System.out.println(randomKey);

                scanner = new Scanner(System.in);
                System.out.print("Definition: ");
                ans = scanner.nextLine();

                if(ans.equals("abort")){
                    break;
                }

                if (ans.equals(value)) {
                    scanner = new Scanner(System.in);
                    System.out.println("Correct! Press enter to continue.");
                    ans = scanner.nextLine();
                } else {
                    scanner = new Scanner(System.in);
                    System.out.println("Incorrect. " + randomKey + " means " + value + ". Press enter to continue.");
                    ans = scanner.nextLine();
                }
            }
        }
    }
}
