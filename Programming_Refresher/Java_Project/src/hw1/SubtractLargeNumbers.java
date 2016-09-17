package hw1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubtractLargeNumbers implements LargeNumberArithmetic {

	@Override
	public String subtractNumbers(String num1, String num2) {

		String resultString = "";
		int numLength1 = num1.length();
		int numLength2 = num2.length();
		int maxLength = numLength1 > numLength2 ? numLength1 : numLength2;

		int number1[] = new int[maxLength];
		int number2[] = new int[maxLength];
		int i, j;
		for (i = 0; i < numLength1; i++)
			number1[i] = num1.charAt(numLength1 - 1 - i) - '0';

		for (j = 0; j < numLength2; j++)
			number2[j] = num2.charAt(numLength2 - 1 - j) - '0';

		int result[] = new int[maxLength];
		int borrow = 0;
		int k, p;
		char sign = '0';
		int[] largeNum = null;
		int[] smallNum = null;

		// Find the largest of two numbers
		for (int i1 = maxLength - 1; i1 >= 0; i1--) {
			if (number1[i1] > number2[i1]) {
				largeNum = number1;
				smallNum = number2;
				sign = '+';
				break;
			} else if (number1[i1] < number2[i1]) {
				largeNum = number2;
				smallNum = number1;
				sign = '-';
				break;
			} else {
				if (i1 != 0)
					continue;
				sign = 'E';
			}

		}

		// Find the difference
		if (sign == 'E') {
			resultString = String.valueOf(0);
		} else {
			for (k = 0; k < maxLength; k++) {
				if (largeNum[k] > smallNum[k])
					result[k] = largeNum[k] - (smallNum[k] + borrow);
				else if (largeNum[k] > smallNum[k]) {
					result[k] = (10 + largeNum[k]) - (smallNum[k] + borrow);
					borrow = 1;
				} else
					result[k] = 0;
			}

			resultString += sign;
			if (result[maxLength - 1] != 0) {
				resultString += result[maxLength - 1];
			}
			for (p = maxLength - 2; p >= 0; p--) {
				resultString += result[p];
			}
		}
		return resultString;

	}

	@Test
	public void testInterface() {

		LargeNumberArithmetic lna = new SubtractLargeNumbers();
		assertEquals(lna.subtractNumbers("4444", "1111"), "+3333");
		assertEquals(lna.subtractNumbers("1111", "4444"), "-3333");
	}

}
