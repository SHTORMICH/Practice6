package com.epam.rd.java.basic.practice6.part1;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class WordContainerTest {

    @Test
    public void sortAndCountWordsTest() {
        List<Word> listExpected = Arrays.asList(new Word("asdf", 3),
                new Word("43", 2),
                new Word("asd", 2),
                new Word("434", 1),
                new Word("kasdf", 1));
        List<String> words = Arrays.asList("asd","43","asdf","asd","43","434","asdf","kasdf","asdf");
        List<Word> testedList = WordContainer.sortAndCountWords(words);
        for (int i = 0; i < listExpected.size(); i++) {
            Assert.assertEquals(listExpected.get(i).getContent(), testedList.get(i).getContent());
            Assert.assertEquals(listExpected.get(i).getFrequency(), testedList.get(i).getFrequency());
        }
    }
}
