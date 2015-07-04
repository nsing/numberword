package com.exercise;

/**
 * Number helper for calculations.
 * 
 */
public class NumberHelper {

	/** 
	 * Number groups
	 * E.g. number 12 in 12345 belongs to number group 1000 (index 3)  
	 */
	private final int[] numberGroups = { 1, 10, 100, 1000, 1000000 };

	/**
	 * Returns number group index.
	 * 
	 * @param digitCount
	 *            number of digits in the number
	 * @param numberGroupSize
	 * @return number group index
	 */
	public int getNumberGroupIndex(int digitCount) {
		if (3 >= digitCount) { // 1 - 3
			return digitCount - 1;
		} else if (6 >= digitCount) { // 4 - 6
			return 3;
		} else { // 7
			return 4;
		}
	}

	/**
	 * Returns number's digit count.
	 * 
	 * @param number
	 *            number
	 * @return number's digit count
	 */
	public int getDigitCount(int number) {
		return String.valueOf(number).length();
	}

	/**
	 * Removes number group number from the number and returns the resulting
	 * number.
	 * 
	 * @param number
	 *            number
	 * @param index
	 *            index
	 * @return number resulting after removal of a number group
	 */
	public int removeNumberGroup(int number, int index) {
		return number - (number / numberGroups[index]) * numberGroups[index];
	}

	/**
	 * Returns number group.
	 * 
	 * @param index
	 *            index
	 * @return number group
	 */
	public int getNumberGroup(int index) {
		return numberGroups[index];
	}

}
