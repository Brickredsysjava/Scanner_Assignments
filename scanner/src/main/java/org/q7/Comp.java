package org.q7;

import java.util.Scanner;

public class Comp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        boolean isEqual = compareStrings(str1, str2);

        System.out.println("The strings are " + (isEqual ? "equal" : "not equal"));
    }

    public static boolean compareStrings(String str1, String str2) {
        // Ignore white space and capitalization
        str1 = str1.replaceAll("\\s", "").toLowerCase();
//        In the line str1 = str1.replaceAll("\\s", "").toLowerCase();, the replaceAll method is used to remove any white space characters (such as spaces, tabs, and new lines) from the string str1.
//        The regular expression \\s is used to match any white space character. The first backslash escapes the second backslash so that it is interpreted as a literal backslash character.
//         The empty string "" is used as the replacement value, which effectively removes all the matched white space characters.
//        The resulting string with no white space is then converted to lowercase using the toLowerCase() method. This is done to ignore any differences in capitalization when comparing the two strings, as specified in the requirements of the problem.


        str2 = str2.replaceAll("\\s", "").toLowerCase();

        return str1.equals(str2);
    }
}
