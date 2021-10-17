package com.epam.rd.java.basic.practice6;

import com.epam.rd.java.basic.practice6.part6.Part6;
import com.epam.rd.java.basic.practice6.part6.Part61;
import com.epam.rd.java.basic.practice6.part6.Part62;
import com.epam.rd.java.basic.practice6.part6.Part63;

public class Demo {
	private static final String PATH_TO_FILE = "part6.txt";

	public static void main(String[] args) {

		System.out.println("~~~~~~~~~~~~Part6");

		Part6.main(new String[] {"-i", PATH_TO_FILE, "-t", "frequency"});
		Part6.main(new String[] {"--input", PATH_TO_FILE, "--task", "length"});
		Part6.main(new String[] {"--input", PATH_TO_FILE, "--task", "duplicates"});

		Part61.main(args);
		Part62.main(args);
		Part63.main(args);
	}
}
