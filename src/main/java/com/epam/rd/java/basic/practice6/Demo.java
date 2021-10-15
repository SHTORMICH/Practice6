package com.epam.rd.java.basic.practice6;

import com.epam.rd.java.basic.practice6.part6.Part6;
import com.epam.rd.java.basic.practice6.part6.Part61;
import com.epam.rd.java.basic.practice6.part6.Part62;
import com.epam.rd.java.basic.practice6.part6.Part63;

public class Demo {
	private static final String INPUT = "--input";
	private static final String CLASSPATH = "part6.txt";
	private static final String TASK = "--task";

	public static void main(String[] args) {

		System.out.println("~~~~~~~~~~~~Part6");

		Part6.main(new String[] {INPUT, CLASSPATH, TASK, "frequency"});
		Part6.main(new String[] {INPUT, CLASSPATH, TASK, "length"});
		Part6.main(new String[] {INPUT, CLASSPATH, TASK, "duplicates"});

		Part61.main(args);
		Part62.main(args);
		Part63.main(args);
	}

}
