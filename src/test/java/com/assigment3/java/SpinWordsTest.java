package com.assigment3.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpinWordsTest {

	@Test
	void test() {
		assertEquals(SpinWords.spinWords("Welcome"), "emocleW");
		assertEquals(SpinWords.spinWords("Hey fellow warriors"), "Hey wollef sroirraw");
		assertEquals(SpinWords.spinWords("This is a test"), "This is a test");
		assertEquals(SpinWords.spinWords("This is another test"), "This is rehtona test");
		assertEquals(SpinWords.spinWords("You are almost to the last test"), "You are tsomla to the last test");
		assertEquals(SpinWords.spinWords("Just kidding there is still one more"), "Just gniddik ereht is llits one more");
	    assertEquals(SpinWords.spinWords("Seriously this is the last one"), "ylsuoireS this is the last one");
	}

}
