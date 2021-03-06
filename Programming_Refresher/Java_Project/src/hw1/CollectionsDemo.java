package hw1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class CollectionsDemo {
	
	//lexicoraphically smallest substring
	
	public String getSmallestSubstring(String s, int subLength){
		List<String> stringList = new ArrayList<String>();
		for(int i=0;i<=s.length()-subLength;i++){
			stringList.add(s.substring(i, i+subLength));
		}
		Collections.sort(stringList);
		return stringList.get(0);
	}
	
	@Test
	public void testCollections() {

		assertEquals(getSmallestSubstring("radhika",2), "ad");
		assertEquals(getSmallestSubstring("helloworld",2), "el");
	}

}
