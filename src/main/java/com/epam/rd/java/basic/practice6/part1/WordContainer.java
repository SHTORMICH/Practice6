package com.epam.rd.java.basic.practice6.part1;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class WordContainer {
	private static final Logger logger = Logger.getLogger(WordContainer.class.getName());
	
	public static void main(String[] args) {
		List<String> text = readerFromConsole();
		List<Word> list = text.stream()
				.collect(Collectors.groupingBy(w -> w,Collectors.counting()))
				.entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
						.thenComparing(Map.Entry.comparingByKey()))
				.map(entry -> new Word(entry.getKey(), Math.toIntExact(entry.getValue())))
				.collect(Collectors.toList());

		for (Word word : list) {
			logger.log(Level.INFO, () -> word.getContent() + " : " + word.getFrequency());
		}

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
