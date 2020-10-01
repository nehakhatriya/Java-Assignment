package com.fileio.java;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FileExistTest {

	@Test
	@DisplayName("File doesn't exist ")
	void test1() {
		assertEquals(false,FileExist.fileExists(new File("X://test.txt")));
	}
	
	@Test
	@DisplayName("File exist ")
	void test2() {
		assertEquals(true,FileExist.fileExists(new File("X://LineWord.txt")));
	}

}
