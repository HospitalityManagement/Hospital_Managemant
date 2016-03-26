package com.company.hospitalitymanagement.entity;

public class Address {

	private String doctorId;
	private String country;
	private String state;
	private String street;
	private String road;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String doctorId, String country, String state,
			String street, String road) {
		super();
		this.doctorId = doctorId;
		this.country = country;
		this.state = state;
		this.street = street;
		this.road = road;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	@Override
	public String toString() {
		return "Address [doctorId=" + doctorId + ", country=" + country
				+ ", state=" + state + ", street=" + street + ", road=" + road
				+ "]";
	}

}
