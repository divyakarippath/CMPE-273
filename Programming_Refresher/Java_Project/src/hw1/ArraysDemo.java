package hw1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArraysDemo {
	
	public String addNumbers(String num1, String num2) {

		String resultString="";
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
		int result[] = new int[maxLength + 1];
		int carry = 0;
		int k, p, sum;
		for (k = 0; k < maxLength; k++) {
			sum = number1[k] + number2[k] + carry;
			if (sum >= 10) {
				result[k] = sum % 10;
				carry = 1;
			} else {
				result[k] = sum;
				carry = 0;
			}
		}
		result[maxLength] = carry;
		if (result[maxLength] != 0) {
			resultString+=String.valueOf(result[maxLength]);
		}
		for (p = maxLength - 1; p >= 0; p--) {
			resultString+=String.valueOf(result[p]);
		}
		return resultString;
	}
	
	@Test
	public void testArray() {

		assertEquals(addNumbers("1111","1111"), "2222");
		assertEquals(addNumbers("66666","66666"), "133332");
	}

}
