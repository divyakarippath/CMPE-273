package hw1;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import org.junit.Test;

public class QueueDemo {

	Queue<Customers> customerList = new LinkedList<Customers>();

	public void enqueue(Customers customer) {
		try {
			customerList.add(customer);
		} catch (IllegalStateException e) {

			e.printStackTrace();

		}

	}

	public Customers dequeue() {
		try {
			if (!isEmpty()) {
				return customerList.remove();
			}
		} catch (NoSuchElementException e) {

			e.printStackTrace();

		}

		return null;
	}

	public Customers peek() {
		return customerList.peek();
	}

	public boolean isEmpty() {
		return (customerList.size() == 0);
	}

	@Test
	public void testQueue() {

		Customers cust1 = new Customers("Divya", "Karippath", 1);
		enqueue(cust1);
		Customers cust2 = new Customers("Vidya", "Vijayan", 2);
		enqueue(cust2);
		Customers cust3 = new Customers("Radhika", "Mohan", 3);
		enqueue(cust3);
		assertEquals(peek().getFirstName(), "Divya");
		assertEquals(dequeue().getFirstName(), "Divya");
		assertEquals(peek().getTokenNumber(), 2);
		assertEquals(dequeue(), cust2);
		assertEquals(peek().getLastName(), "Mohan");
		assertEquals(dequeue(), cust3);
		assertEquals(peek(), null);
	}

}

class Customers {
	String firstName;
	String lastName;
	int tokenNumber;

	public Customers() {

	}

	public Customers(String fName, String lName, int tokenNumber) {
		this.firstName = fName;
		this.lastName = lName;
		this.tokenNumber = tokenNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getTokenNumber() {
		return tokenNumber;
	}

}
