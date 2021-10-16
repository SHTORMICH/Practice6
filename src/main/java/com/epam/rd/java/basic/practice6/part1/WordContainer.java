package com.epam.rd.java.basic.practice6.part1;

import java.util.*;
import java.util.stream.Collectors;

public class WordContainer {
	
	public static void main(String[] args) {
		List<String> text = readerFromConsole();
		List<Word> list = sortAndCountWords(text);
		for (Word word : list) {
			System.out.println(word.getContent() + " : " + word.getFrequency());
		}

	}

	public static List<Word> sortAndCountWords(List<String> text) {
		 return text.stream()
				.collect(Collectors.groupingBy(w -> w,Collectors.counting()))
				.entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
						.thenComparing(Map.Entry.comparingByKey()))
				.map(entry -> new Word(entry.getKey(), Math.toIntExact(entry.getValue())))
				.collect(Collectors.toList());
	}

	public static List<String> readerFromConsole() {
		Scanner scanner = new Scanner(System.in);
		List<String> listWords = new ArrayList<>();
		String input = scanner.next();
		while (!input.equalsIgnoreCase("Stop")) {
			listWords.add(input);
			input = scanner.next();
		}
		return listWords;
	}
	
}
