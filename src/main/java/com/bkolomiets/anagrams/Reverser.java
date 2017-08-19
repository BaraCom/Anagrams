package com.bkolomiets.anagrams;

import static java.lang.Character.isLetter;

public class Reverser {

    public String reverseLine(String line) {
        String result = "";
        while (line.contains(" ")) {
            result = result + reverseWord(line.substring(0, line.indexOf(" "))) + " ";
            line = line.substring(line.indexOf(" ") + 1);
        }
        return result + reverseWord(line);
    }

    public String reverseWord(String word) {
        char[] chars = word.toCharArray();
        char[] resultChars = new char[chars.length];
        int lastIndex = resultChars.length - 1;

        for (int i = 0; i < chars.length; i++) {
            for (int j = chars.length - 1; j >= 0; j--) {
                if (isLetter(chars[i])) {
                    if (isLetter(chars[lastIndex])) {
                        resultChars[lastIndex] = chars[i];
                        lastIndex--;
                        break;
                    } else {
                        lastIndex--;
                    }
                } else {
                    resultChars[i] = chars[i];
                }
            }
        }
        return new String(resultChars);
    }
}
