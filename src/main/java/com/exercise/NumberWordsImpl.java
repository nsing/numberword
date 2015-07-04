package com.exercise;

/**
 * Number words converter implementation.
 * 
 */
public class NumberWordsImpl implements NumberWords {

	/** WordStore dependency */
	private WordStore wordStore;

	/** NumberHelper dependency */
	private NumberHelper numberHelper;

	/**
	 * Constructor.
	 * 
	 * @param wordStore
	 *            word store
	 * @param numberHelper
	 *            number helper
	 */
	public NumberWordsImpl(WordStore wordStore, NumberHelper numberHelper) {
		this.wordStore = wordStore;
		this.numberHelper = numberHelper;
	}

	/**
	 * Converts given number into words.
	 * 
	 * @param number
	 *            number to be converted into words
	 * @return number in words
	 */
	public String getWords(int number) {
		if (999999999 < number) { // More than max value supported
			throw new IllegalArgumentException(
					wordStore.CONVERSION_NOT_SUPPORTED);
		} else { // Other values
			return getWords(number, false);
		}
	}

	/**
	 * Converts given number into words recursively.
	 * 
	 * @param number
	 *            number to be converted into words
	 * @param lastWord
	 *            flag indicating whether connector i.e. "and" is to be added or
	 *            not
	 * @return number in words
	 */
	private String getWords(int number, boolean lastWord) {
		String word;
		int digits = numberHelper.getDigitCount(number);
		int groupIndex = numberHelper.getNumberGroupIndex(digits);
		int groupValue = numberHelper.getNumberGroup(groupIndex);
		if (number <= 19) { // Number 0 - 19
			// Set word group one word from WordStore
			word = wordStore.getWordGroupOne(number, lastWord);
		} else { // Numbers > 19
			if (number <= 99)
				// Set word group two word (twenty/.../ninety)
				word = wordStore.getWordGroupTwo(number / groupValue - 2, lastWord);
			else
				// Build word with recursive call for million/thousand/hundred
				word = getWords(number / groupValue, false);
			// Add corresponding group three word i.e. million/thousand/hundred
			if (!wordStore.getWordGroupThree(groupIndex).isEmpty())
				word += wordStore.SEPERATOR
						+ wordStore.getWordGroupThree(groupIndex);
			// If number gives reminder > 0 when divided by
			// million/thousand/hundred then build word with 
			// recursive call after removing million/thousand/hundred 
			// number group number from the number
			if (0 < number % groupValue) {
				int newNumber = numberHelper.removeNumberGroup(number,
						groupIndex);
				boolean flag = false;
				if (number > 99)
					flag = true;
				word += wordStore.SEPERATOR + getWords(newNumber, flag);
			}
		}
		return word;
	}

}
