package com.epam.rd.java.basic.practice6;

import com.epam.rd.java.basic.practice6.part6.Part6;
import com.epam.rd.java.basic.practice6.part6.Part61;
import com.epam.rd.java.basic.practice6.part6.Part62;
import com.epam.rd.java.basic.practice6.part6.Part63;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class Demo {

	public static void main(String[] args) {

		System.out.println("~~~~~~~~~~~~Part6");

		System.setIn(new ByteArrayInputStream("--input^part6.txt^--task^frequency".replace("^", System.lineSeparator()).getBytes(StandardCharsets.UTF_8)));
		Part6.main(args);
		System.setIn(new ByteArrayInputStream("--input^part6.txt^--task^length".replace("^", System.lineSeparator()).getBytes(StandardCharsets.UTF_8)));
		Part6.main(args);
		System.setIn(new ByteArrayInputStream("--input^part6.txt^--task^duplicates".replace("^", System.lineSeparator()).getBytes(StandardCharsets.UTF_8)));
		Part6.main(args);


		Part61.main(args);
		Part62.main(args);
		Part63.main(args);
	}
}
