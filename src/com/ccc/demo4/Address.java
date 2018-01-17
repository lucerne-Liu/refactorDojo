package com.ccc.demo4;

import java.util.Map;

public class Address {
	private static final String COMMA_SPACE = ", ";
	private String streetNumber;
	private String apartmentNumber;
	private String streetName;
	private String city;
	private String state;
	private String zip;

	@Override
	public String toString() {
		final StringBuffer value = new StringBuffer();
		value.append(format(null, getStreetNumber(), COMMA_SPACE));
		value.append(getStreetName());
		value.append(COMMA_SPACE);
		value.append(format(null, getApartmentNumber(), COMMA_SPACE));
		value.append(getCity());
		value.append(COMMA_SPACE);
		value.append(getState());
		value.append(format(" ", getZip(), null));
		return value.toString();
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

	private String format(String prefix, String value, String suffix) {
		StringBuffer retVal = new StringBuffer();
		if (value != null && !value.trim().isEmpty()) {
			if (prefix != null) {
				retVal.append(prefix);
			}
			retVal.append(value);
			if (suffix != null) {
				retVal.append(suffix);
			}
		}
		return retVal.toString();
	}
}
