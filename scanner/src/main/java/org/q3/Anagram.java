package org.q3;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Convert the input strings to lowercase so that we can ignore case
        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();

        // Convert the input strings to character arrays and sort them
        char[] firstCharArray = firstString.toCharArray();
        Arrays.sort(firstCharArray);
        char[] secondCharArray = secondString.toCharArray();
        Arrays.sort(secondCharArray);

        // Check if the sorted character arrays are equal
        boolean areAnagrams = Arrays.equals(firstCharArray, secondCharArray);

        if (areAnagrams) {
            System.out.println("The two strings are anagrams of each other.");
        } else {
            System.out.println("The two strings are not anagrams of each other.");
        }
    }
}

