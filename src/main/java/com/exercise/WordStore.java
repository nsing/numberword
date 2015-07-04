package com.exercise;

/**
 * Contains all the words and related access functions.
 *
 */
public class WordStore {

	/** Conversion not supported message */
	public final String CONVERSION_NOT_SUPPORTED = "conversion not supported";

	/** Connector "and" */
	public final String CONNECTOR = "and";

	/** Separator " " */
	public final String SEPERATOR = " ";

	private final String WORD_GROUP_ONE[] = { "zero", "one", "two", "three", "four",
			"five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen"};

	private final String WORD_GROUP_TWO[] = { "twenty", "thirty", "forty", "fifty",
			"sixty", "seventy", "eighty", "ninety" };

	private final String WORD_GROUP_THREE[] = { "", "", "hundred", "thousand", "million" };

	/**
	 * Returns word group one word for a given index.
	 * 
	 * @param index
	 *            index
	 * @param lastWord
	 *            flag indicating whether "and" has to be added or not
	 * @return word group one word
	 */
	public String getWordGroupOne(int index, boolean lastWord) {
		return lastWord ? CONNECTOR + SEPERATOR + WORD_GROUP_ONE[index]
				: WORD_GROUP_ONE[index];
	}
	
	/**
	 * Returns word group two word for a given index.
	 * 
	 * @param index
	 *            index
	 * @param lastWord
	 *            flag indicating whether "and" has to be added or not            
	 * @return word group two word
	 */
	public String getWordGroupTwo(int index, boolean lastWord) {
		return lastWord ? CONNECTOR + SEPERATOR + WORD_GROUP_TWO[index]
				: WORD_GROUP_TWO[index];
	}
	
	/**
	 * Returns word group three word for a given index.
	 * 
	 * @param index
	 *            index
	 * @return word group two word
	 */
	public String getWordGroupThree(int index) {
		return WORD_GROUP_THREE[index];
	}

}
