package com.fileio.java;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WordCountTest {

	@Test
	@DisplayName("File with content")
	void test1() throws IOException{
		assertEquals(14,WordCount.count(new File("X://LineWord.txt")));
	}

	@Test
	@DisplayName("File with no content")
	void test2() throws IOException{
		assertEquals(0,WordCount.count(new File("X://Empty.txt")));
	}
}
