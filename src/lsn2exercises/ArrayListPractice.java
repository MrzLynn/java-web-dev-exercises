package lsn2exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> someIntegers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 33, 42, 1138));
        String phrase = "I would not could eat them in a box I would not could not eat the in a house I will not eat them with a mouse.";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(phrase.split(" ")));
        Scanner input = new Scanner(System.in);

        System.out.println(sumEven((someIntegers)));

        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        printFiveLettersWords(wordList, numChars);
    }
        public static int sumEven(ArrayList<Integer> arr) {
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
    }
    public static void printFiveLettersWords(ArrayList<String> arr, int length) {
        for(String word: arr) {
            if(word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
