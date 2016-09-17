package hw1;

import org.junit.Before;
import org.junit.Test;

public class MultithreadingDemo {
	private OddThread odd;
	private EvenThread even;

	@Before
	public void testSetup() {
		odd=new OddThread();
		even=new EvenThread();
	}
	@Test
	public void testRun(){
		odd.start();		
		even.start();
	}

}
