package hw1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GenericsDemo {

	public static double findSumOfElements(List<? extends Number> elem) {
		double sum = 0.0;
		for(Number element:elem){
			sum+=element.doubleValue();
		}
		return sum;
	}

	@Test
	public void testGeneric() {
		List<Integer> intList = new ArrayList<Integer>();
		List<Double> doubleList = new ArrayList<Double>();
		List<Long> longList = new ArrayList<Long>();
		
		for(int i=1;i<=5;i++){
			intList.add(i);
			doubleList.add(0.5*i);
		}
		longList.add(1L);
		longList.add(2L);
		longList.add(3L);
		
		assertEquals(findSumOfElements(intList),15,0.00);
		assertEquals(findSumOfElements(doubleList),7.5,0.00);
		assertEquals(findSumOfElements(longList),6,0.00);
	}
}
