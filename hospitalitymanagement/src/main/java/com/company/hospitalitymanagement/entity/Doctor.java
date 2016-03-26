package com.company.hospitalitymanagement.entity;

import java.util.List;

public class Doctor {
	
	private String doctorId;
	private String doctoreName;
	private String doctorEmail;
	private String doctorPassword;
	private Long doctoreMobileNumber;
	private Address doctorAddress;
	private Department department;
	private List<Appointment> appointmentList;
	private String tenentId;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Doctor(String doctorId, String doctoreName, String doctorEmail,
			String doctorPassword, Long doctoreMobileNumber,
			Address doctorAddress, Department department,
			List<Appointment> appointmentList, String tenentId) {
		super();
		this.doctorId = doctorId;
		this.doctoreName = doctoreName;
		this.doctorEmail = doctorEmail;
		this.doctorPassword = doctorPassword;
		this.doctoreMobileNumber = doctoreMobileNumber;
		this.doctorAddress = doctorAddress;
		this.department = department;
		this.appointmentList = appointmentList;
		this.tenentId = tenentId;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctoreName() {
		return doctoreName;
	}

	public void setDoctoreName(String doctoreName) {
		this.doctoreName = doctoreName;
	}

	public String getDoctorEmail() {
		return doctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	public String getDoctorPassword() {
		return doctorPassword;
	}

	public void setDoctorPassword(String doctorPassword) {
		this.doctorPassword = doctorPassword;
	}

	public Long getDoctoreMobileNumber() {
		return doctoreMobileNumber;
	}

	public void setDoctoreMobileNumber(Long doctoreMobileNumber) {
		this.doctoreMobileNumber = doctoreMobileNumber;
	}

	public Address getDoctorAddress() {
		return doctorAddress;
	}

	public void setDoctorAddress(Address doctorAddress) {
		this.doctorAddress = doctorAddress;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	public String getTenentId() {
		return tenentId;
	}

	public void setTenentId(String tenentId) {
		this.tenentId = tenentId;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctoreName=" + doctoreName
				+ ", doctorEmail=" + doctorEmail + ", doctorPassword="
				+ doctorPassword + ", doctoreMobileNumber="
				+ doctoreMobileNumber + ", doctorAddress=" + doctorAddress
				+ ", department=" + department + ", appointmentList="
				+ appointmentList + ", tenentId=" + tenentId + "]";
	}
}
