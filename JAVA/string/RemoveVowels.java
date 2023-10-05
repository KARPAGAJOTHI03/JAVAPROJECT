package com.string;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sample input1: ");
        String inputString = sc.nextLine();
        String outputString = removeConsecutiveVowels(inputString);
        System.out.println("Sample output1:" + outputString);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Sample input2: ");
        String inString = sc1.nextLine();
        String outString = removeConsecutiveVowels(inString);
        System.out.println("Sample output2:" + outString);
    }

    public static String removeConsecutiveVowels(String string) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c1 = string.charAt(i);
            if (!vowels.contains(Character.toString(c1)) || (i > 0 && c1 != string.charAt(i - 1))) {
                result.append(c1);
            }
        }
        return result.toString();
    }
}
