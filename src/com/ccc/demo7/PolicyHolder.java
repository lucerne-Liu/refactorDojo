package com.ccc.demo7;

public class PolicyHolder {
	private String name;
	private Address address;
	private int age;

	public String getDisplayString() {
		return getName() + "\n" + getAddress();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}
