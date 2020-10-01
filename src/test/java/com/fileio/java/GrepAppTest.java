package com.fileio.java;
import java.io.*;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GrepAppTest {

	
	@Test
	@DisplayName("File containing `is` on multiple lines ")
	void test1() throws IOException{
		Map<Integer,String> src=GrepApp.search("is",new File("X://LineWord.txt"));
		assertEquals(2,src.size());
	}

	@Test
	@DisplayName("File containing `line` on multiple lines ")
	void test2() throws IOException{
		Map<Integer,String> src=GrepApp.search("line",new File("X://LineWord.txt"));
		assertEquals(1,src.size());
	}
}
