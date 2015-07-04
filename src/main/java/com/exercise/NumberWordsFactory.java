package com.exercise;

import java.util.Scanner;

/**
 * NumberWords factory.
 *
 */
public class NumberWordsFactory {

	/**
	 * Factory method.
	 * 
	 * @return NumberWords NumberWords
	 */
	public static NumberWords getNumberWords() {
		return new NumberWordsImpl(new WordStore(), new NumberHelper());
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 *            arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		System.out.println("Words: " + getNumberWords().getWords(number));
	}

}
