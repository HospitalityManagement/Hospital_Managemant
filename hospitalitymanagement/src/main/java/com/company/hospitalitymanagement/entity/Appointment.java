package com.company.hospitalitymanagement.entity;

import java.sql.Timestamp;

public class Appointment {

	private String appointmentId;
	private Doctor doctor;
	private Timestamp appointmentFromDate;
	private Timestamp appointmentToDate;
	
	public Appointment(){
		super();
	}

	public Appointment(String appointmentId, Doctor doctor,
			Timestamp appointmentFromDate, Timestamp appointmentToDate) {
		super();
		this.appointmentId = appointmentId;
		this.doctor = doctor;
		this.appointmentFromDate = appointmentFromDate;
		this.appointmentToDate = appointmentToDate;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Timestamp getAppointmentFromDate() {
		return appointmentFromDate;
	}

	public void setAppointmentFromDate(Timestamp appointmentFromDate) {
		this.appointmentFromDate = appointmentFromDate;
	}

	public Timestamp getAppointmentToDate() {
		return appointmentToDate;
	}

	public void setAppointmentToDate(Timestamp appointmentToDate) {
		this.appointmentToDate = appointmentToDate;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", doctor="
				+ doctor + ", appointmentFromDate=" + appointmentFromDate
				+ ", appointmentToDate=" + appointmentToDate + "]";
	}
	

}
