package com.spring.myspringapp.beans;

public class AddressImpl implements Address {
	
	private String AddressLine;
	private int pincode;
	
	

	public AddressImpl(String addressLine, int pincode) {
		super();
		AddressLine = addressLine;
		this.pincode = pincode;
	}

	


	public String getAddressLine() {
		return AddressLine;
	}
	public void setAddressLine(String addressLine) {
		AddressLine = addressLine;
	}
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}




	@Override
	public String toString() {
		return "AddressImpl [AddressLine=" + AddressLine + ", pincode=" + pincode + "]";
	}




	public String getAddress() {
		
		return toString();
	}

}
