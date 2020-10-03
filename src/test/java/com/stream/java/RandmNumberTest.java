package com.stream.java;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class RandmNumberTest {

	@Test
	void test() throws IOException {
		RandmNumber.generateRandNum("X://rdm.txt");
	}

}
