package com.ccc.demo1;

import static sun.misc.VM.getState;

public class PolicyHolder {
	private String name;
	private Address address;
	private int age;

	public PolicyHolder(Address address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}


	public String toDisplaString() {
		StringBuffer displayString = new StringBuffer();
		displayString.append(getName());
		displayString.append(":");
		displayString.append(address.getApartmentNumber()).append(" ");
		displayString.append(address.getStreetNumber()).append(" ");
		displayString.append(address.getStreetName()).append(",").append(" ");
		displayString.append(address.getCity()).append(" ");
		displayString.append(address.getState()).append(",").append(" ");
		displayString.append(address.getZip());
		return displayString.toString();
	}
}
