package com.fileio.java;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LineCountTest {

	@Test
	@DisplayName("File with some content")
	void test1() throws IOException{
		assertEquals(5,LineCount.count(new File("X://LineWord.txt")));
	}

	@Test
	@DisplayName("File with no content")
	void test2() throws IOException{
		assertEquals(0,LineCount.count(new File("X://Empty.txt")));
	}
}
