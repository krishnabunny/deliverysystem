/**
 * 
 */
package com.delivery.pojo;

/**
 * @author Shiva
 * 
 */
public class Address {

	String addressLine1;
	String addressLine2;
	String city;
	String state;
	String country;
	Integer ZIPCODE;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getZIPCODE() {
		return ZIPCODE;
	}

	public void setZIPCODE(Integer zIPCODE) {
		ZIPCODE = zIPCODE;
	}

}
