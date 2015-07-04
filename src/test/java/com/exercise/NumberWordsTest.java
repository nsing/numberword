package com.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

import com.exercise.NumberWords;
import com.exercise.NumberWordsFactory;

/**
 * JUnit tests for NumberWords.
 *
 */
public class NumberWordsTest {
	
	/** NumberWords*/
	private NumberWords numberWords;

	@Before
	public void setUp() {
		numberWords = NumberWordsFactory.getNumberWords();
	}
	
	@Test
	public void testWordGroupOne() {
		assertEquals("zero", numberWords.getWords(0));
		assertEquals("one", numberWords.getWords(1));
		assertEquals("two", numberWords.getWords(2));
		assertEquals("three", numberWords.getWords(3));
		assertEquals("four", numberWords.getWords(4));
		assertEquals("five", numberWords.getWords(5));
		assertEquals("six", numberWords.getWords(6));
		assertEquals("seven", numberWords.getWords(7));
		assertEquals("eight", numberWords.getWords(8));
		assertEquals("nine", numberWords.getWords(9));
		assertEquals("ten", numberWords.getWords(10));
		assertEquals("eleven", numberWords.getWords(11));
		assertEquals("twelve", numberWords.getWords(12));
		assertEquals("thirteen", numberWords.getWords(13));
		assertEquals("fourteen", numberWords.getWords(14));
		assertEquals("fifteen", numberWords.getWords(15));
		assertEquals("sixteen", numberWords.getWords(16));
		assertEquals("seventeen", numberWords.getWords(17));
		assertEquals("eighteen", numberWords.getWords(18));
		assertEquals("nineteen", numberWords.getWords(19));
		assertEquals("twenty", numberWords.getWords(20));
	}
	
	@Test
	public void testWordGroupTwo() {
		assertEquals("thirty", numberWords.getWords(30));
		assertEquals("forty", numberWords.getWords(40));
		assertEquals("fifty", numberWords.getWords(50));
		assertEquals("sixty", numberWords.getWords(60));
		assertEquals("seventy", numberWords.getWords(70));
		assertEquals("eighty", numberWords.getWords(80));
		assertEquals("ninety", numberWords.getWords(90));
	}
	
	@Test
	public void testWordGroupThree() {
		assertEquals("twenty one", numberWords.getWords(21));
		assertEquals("fifty five", numberWords.getWords(55));
		assertEquals("ninety nine", numberWords.getWords(99));
		assertEquals("one hundred", numberWords.getWords(100));
		assertEquals("one hundred and one", numberWords.getWords(101));
		assertEquals("one thousand", numberWords.getWords(1000));
		assertEquals("one thousand and one", numberWords.getWords(1001));
		assertEquals("one million", numberWords.getWords(1000000));
		assertEquals("one million and one", numberWords.getWords(1000001));
		assertEquals("one hundred and eleven million one hundred and eleven thousand one hundred and eleven", numberWords.getWords(111111111));
		assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", numberWords.getWords(999999999));
	}
	
	@Test
	public void testQuestionValues() {
		assertEquals("one", numberWords.getWords(1));
		assertEquals("twenty one", numberWords.getWords(21));
		assertEquals("one hundred and five", numberWords.getWords(105));
		assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", numberWords.getWords(56945781));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testException() {
		numberWords.getWords(1999999999);
	}
}
