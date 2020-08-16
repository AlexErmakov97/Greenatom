package com.company;

public class DetectedPalindrom {
    public static boolean isPalindrom(String str) {
        if (str == null || str == " ") return false;
        String currentString = getString(str);
        StringBuilder reverseString = new StringBuilder(currentString).reverse();
        return reverseString.toString().equals(currentString);
    }

    private static String getString(String string) {
        String temp = string.toLowerCase();
        StringBuilder resultString = new StringBuilder();
        char space = '\u0020';
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != space) {
                resultString.append(string.charAt(i));
            }
            continue;
        }
        return resultString.toString();
    }

    public static boolean isPalindromeV2(String text) {
        return text.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
                        .reverse().toString());
    }
}
