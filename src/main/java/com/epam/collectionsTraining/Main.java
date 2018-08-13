package com.epam.collectionsTraining;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UniqueChars uniqueChars = new UniqueChars();

        System.out.println(uniqueChars.countUniqueChars("aaabaaabaa"));
        System.out.println(uniqueChars.countUniqueChars("ztztzbvnhjhf"));
        System.out.println(uniqueChars.countUniqueChars("tttttr"));
        System.out.println(uniqueChars.countUniqueChars("aaabaaabaa"));
        System.out.println(uniqueChars.countUniqueChars("ztztzbvnhjhf"));
        System.out.println(uniqueChars.countUniqueChars("eeet"));

        AlphabetOrder alphabetOrder = new AlphabetOrder();
        alphabetOrder.printStringAbcOrder("poiuzt fffr eewq mmmkkkaaa");

        System.out.println();
        System.out.println("Please write a sentence: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        CharsOccur charsOccur = new CharsOccur();
        charsOccur.getCharsOccurInIndex(str);

    }
}
