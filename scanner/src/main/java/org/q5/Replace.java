package org.q5;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();
        System.out.print("Enter the word to be replaced: ");
        String wordToBeReplaced = scanner.nextLine();
        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();

        // Replace all occurrences of the specified word with the replacement word
        String newString = originalString.replaceAll(wordToBeReplaced, replacementWord);

        System.out.println("The new string is: " + newString);
    }
}
