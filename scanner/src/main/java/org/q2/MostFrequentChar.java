package org.q2;

import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initialize variables to hold the most frequent character and its count
        char mostFrequentChar = ' ';
        int mostFrequentCount = 0;

        // Convert the input string to lowercase so that we can ignore case
        inputString = inputString.toLowerCase();

        // Loop through each character in the input string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            int currentCount = 0;

            // Count the number of occurrences of the current character in the input string
            for (int j = 0; j < inputString.length(); j++) {
                if (inputString.charAt(j) == currentChar) {
                    currentCount++;
                }
            }

            // If the current character occurs more frequently than the previous most frequent character,
            // update the most frequent character and its count
            if (currentCount > mostFrequentCount) {
                mostFrequentChar = currentChar;
                mostFrequentCount = currentCount;
            }
        }

        // Output the most frequent character and its count
        System.out.println("The most frequent character is '" + mostFrequentChar + "', which occurs " + mostFrequentCount + " times.");
    }
}
