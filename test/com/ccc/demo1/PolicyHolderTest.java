package com.ccc.demo1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
	public class PolicyHolderTest {
		@Test
		public void testShouldProvidePolicyInfo() {
			Address address = new Address();
			address.setApartmentNumber("10");
			address.setCity("Zion");
			address.setState("IL");
			address.setStreetName("Main");
			address.setStreetNumber("1234");
			address.setZip("60666");
			PolicyHolder policyHolder = new PolicyHolder(address);
			policyHolder.setAge(34);
			policyHolder.setName("John Doe");
			assertEquals("John Doe:10 1234 Main, Zion IL, 60666",
					policyHolder.toDisplaString());
		}
	}
