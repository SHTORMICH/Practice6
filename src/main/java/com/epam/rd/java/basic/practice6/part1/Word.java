package com.epam.rd.java.basic.practice6.part1;

public class Word implements Comparable<Word> {

	private final String content;
	private final int frequency;

    public Word(String content, int frequency) {
        this.content = content;
        this.frequency = frequency;
    }

    public String getContent() {
        return content;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public int compareTo(Word o) {
        return 0;
    }

}
