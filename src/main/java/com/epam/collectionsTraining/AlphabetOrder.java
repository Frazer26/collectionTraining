package com.epam.collectionsTraining;

import java.util.*;
import java.util.stream.Collectors;

/*
    Write a method that takes a string as input and returns and prints the chars once in alphabetical order!
 */
class AlphabetOrder {

    void printStringAbcOrder(String str) {
        List<Character> list = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Set<Character> set = new TreeSet<>(list);

        Iterator iterator;
        iterator = set.iterator();

        System.out.println("String chars in ascending order: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
