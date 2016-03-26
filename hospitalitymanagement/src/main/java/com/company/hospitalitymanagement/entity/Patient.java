package com.company.hospitalitymanagement.entity;

public class Patient {

	private String patientName;
	private Long patientMobileNumber;
	private String patientAddress;
	private String patientEmail;
	private Doctor doctor;
	private Appointment appointment;

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient(String patientName, Long patientMobileNumber,
			String patientAddress, String patientEmail, Doctor doctor,
			Appointment appointment) {
		super();
		this.patientName = patientName;
		this.patientMobileNumber = patientMobileNumber;
		this.patientAddress = patientAddress;
		this.patientEmail = patientEmail;
		this.doctor = doctor;
		this.appointment = appointment;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Long getPatientMobileNumber() {
		return patientMobileNumber;
	}

	public void setPatientMobileNumber(Long patientMobileNumber) {
		this.patientMobileNumber = patientMobileNumber;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientMobileNumber="
				+ patientMobileNumber + ", patientAddress=" + patientAddress
				+ ", patientEmail=" + patientEmail + ", doctor=" + doctor
				+ ", appointment=" + appointment + "]";
	}

}
