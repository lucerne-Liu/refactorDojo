package com.ccc.demo4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddressTest {
	@Test
	public void testToString() {
		Address address = new Address();
		address.setStreetNumber("734");
		address.setStreetName("Crane Canyon Place");
		address.setCity("Round Rock");
		address.setState("TX");
		address.setZip("78665");
		assertEquals("734, Crane Canyon Place, Round Rock, TX 78665",
				address.toString());
	}

	@Test
	public void testToStringWithoutStreetNumber() {
		Address address = new Address();
		address.setStreetName("Crane Canyon Place");
		address.setCity("Round Rock");
		address.setState("TX");
		address.setZip("78665");
		assertEquals("Crane Canyon Place, Round Rock, TX 78665",
				address.toString());
	}

	@Test
	public void testToStringWithoutZip() {
		Address address = new Address();
		address.setStreetNumber("734");
		address.setStreetName("Crane Canyon Place");
		address.setCity("Round Rock");
		address.setState("TX");
		assertEquals("734, Crane Canyon Place, Round Rock, TX",
				address.toString());
	}
}
