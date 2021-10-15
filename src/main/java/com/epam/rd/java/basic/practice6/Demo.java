package com.epam.rd.java.basic.practice6;

import com.epam.rd.java.basic.practice6.part6.Part6;
import com.epam.rd.java.basic.practice6.part6.Part61;
import com.epam.rd.java.basic.practice6.part6.Part62;
import com.epam.rd.java.basic.practice6.part6.Part63;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo {
	private static final Logger logger = Logger.getLogger(Demo.class.getName());

	public static void main(String[] args) {

		logger.log(Level.INFO, "~~~~~~~~~~~~Part6");

		Part6.main(new String[] {"--input", "part6.txt", "--task", "frequency"});

		Part6.main(new String[] {"--input", "part6.txt", "--task", "length"});

		Part6.main(new String[] {"--input", "part6.txt", "--task", "duplicates"});

		Part61.main(args);

		Part62.main(args);

		Part63.main(args);
	}

}
