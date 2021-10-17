package com.epam.rd.java.basic.practice6.part6;

import java.util.*;

public class Part62 {

    public static void findThreeWordsWithMaxLength(List<String> words) {
        words.sort(Comparator.comparing(String::length).reversed());
        for (int i = 0; i < 3; i++) {
            System.out.println(words.get(i) + " ==> " + words.get(i).length());
        }
    }


}
