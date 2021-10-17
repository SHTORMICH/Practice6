package com.epam.rd.java.basic.practice6.part6;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Part63{

    public static void findFirstThreeDuplicatedWords(List<String> words) {
        List<String> result = words.stream()
                .filter(w -> Collections.frequency(words, w) > 1)
                .limit(3)
                .collect(Collectors.toSet())
                .stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        Collections.reverse(result);
        for (String word : result) {
            char[] charArray = word.toCharArray();
            StringBuilder resultWord = new StringBuilder();
            for (int i = charArray.length - 1; i >= 0; i--) {
                resultWord.append(charArray[i]);
            }
            System.out.println(resultWord);
        }
    }
}
