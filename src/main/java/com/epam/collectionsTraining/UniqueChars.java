package com.epam.collectionsTraining;


import java.util.Map;
import java.util.TreeMap;

/*
    Write a method that takes a string and returns the number of unique characters in the string.
    It is expected that the same character sequence may be passed several times to the method.
    Since the counting operation can be time consuming, the method should cache the results.
    When the method is given a string previously encountered, it will simply retrieve the stored result.
    param: string
 */
class UniqueChars {

    private Map<String, Integer> savedStringsMap;

    UniqueChars() {
        this.savedStringsMap = new TreeMap<>();
    }

    int countUniqueChars(String str) {
        boolean existStrInMap = savedStringsMap.containsKey(str);
        int count;

        if (existStrInMap) {
            return savedStringsMap.get(str);
        } else {
            count = (int) str.chars().distinct().count();
            savedStringsMap.put(str, count);
            return count;
        }
    }
}
