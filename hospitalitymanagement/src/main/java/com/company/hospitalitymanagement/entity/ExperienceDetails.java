package com.company.hospitalitymanagement.entity;

public class ExperienceDetails {

	private String hospitalName;
	private String description;

	public ExperienceDetails() {
		// TODO Auto-generated constructor stub
	}

	public ExperienceDetails(String hospitalName, String description) {
		super();
		this.hospitalName = hospitalName;
		this.description = description;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ExperienceDetails [hospitalName=" + hospitalName
				+ ", description=" + description + "]";
	}

}
