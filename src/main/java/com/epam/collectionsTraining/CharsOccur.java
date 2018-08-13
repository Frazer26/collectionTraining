package com.epam.collectionsTraining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
    Write a program which creates a concordance of characters occuring in a string.
    (i.e. which characters occur where in the string). Read the string from the command line!
    Example: Hello World -->  d=9 o=4,6 r=7...
 */
class CharsOccur {

    void getCharsOccurInIndex(String str) {
        Map<Character, ArrayList> charWithIndexesMap = new HashMap<>();

        //remove whitespaces and non-visible characters
        str = str.replaceAll("\\s+", "");
        char[] charArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            Character keyChar = charArray[i];
            ArrayList<Integer> listOfIndexes = charWithIndexesMap.get(keyChar);
            if (listOfIndexes == null) {
                listOfIndexes = new ArrayList<>();
            }
            listOfIndexes.add(i);
            charWithIndexesMap.put(keyChar, listOfIndexes);
        }

        charWithIndexesMap.forEach((k, v) -> System.out.print(k + "=" + v + ","));
    }
}
