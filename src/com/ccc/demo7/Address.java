package com.ccc.demo7;

public class Address {
	private final String COMMA_SPACE = ", ";
	private String streetNumber;
	private String apartmentNumber;
	private String streetName;
	private String city;
	private String state;
	private String zip;

	@Override
	public String toString() {
		StringBuffer a = new StringBuffer(getStreetNumber());
		a.append(COMMA_SPACE);
		a.append(getStreetName());
		a.append(COMMA_SPACE);
		if (getApartmentNumber() != null
				&& !getApartmentNumber().trim().isEmpty()) {
			a.append(getApartmentNumber());
			a.append(COMMA_SPACE);
		}
		a.append(getCity());
		a.append(COMMA_SPACE);
		a.append(getState());
		a.append(" ");
		a.append(getZip());
		return a.toString();
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getZip() {
		return zip;
	}

}
