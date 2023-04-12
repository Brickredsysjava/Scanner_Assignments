package org.q1;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String[] words = str.split(" ");
        int count = words.length;

        System.out.println("Number of words: " + count);
    }
}

