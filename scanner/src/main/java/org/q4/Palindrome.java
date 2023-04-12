package org.q4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the input string to lowercase so that we can ignore case
        inputString = inputString.toLowerCase();

        // Remove all non-alphabetic characters from the input string
        inputString = inputString.replaceAll("[^a-z]", "");

        // Reverse the input string
        String reversedString = new StringBuilder(inputString).reverse().toString();

        // Check if the input string is equal to its reversed version
        boolean isPalindrome = inputString.equals(reversedString);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
