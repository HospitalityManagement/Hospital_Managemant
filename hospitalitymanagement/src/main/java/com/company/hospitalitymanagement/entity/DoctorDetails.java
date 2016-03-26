package com.company.hospitalitymanagement.entity;

import java.util.List;

public class DoctorDetails {

	private String doctorId;
	private String collegeName;
	private String university;
	private List<ExperienceDetails> experienceDetails;
	private String qualification;

	public DoctorDetails() {
		// TODO Auto-generated constructor stub
	}

	public DoctorDetails(String doctorId, String collegeName,
			String university, List<ExperienceDetails> experienceDetails,
			String qualification) {
		super();
		this.doctorId = doctorId;
		this.collegeName = collegeName;
		this.university = university;
		this.experienceDetails = experienceDetails;
		this.qualification = qualification;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public List<ExperienceDetails> getExperienceDetails() {
		return experienceDetails;
	}

	public void setExperienceDetails(List<ExperienceDetails> experienceDetails) {
		this.experienceDetails = experienceDetails;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "DoctorDetails [doctorId=" + doctorId + ", collegeName="
				+ collegeName + ", university=" + university
				+ ", experienceDetails=" + experienceDetails
				+ ", qualification=" + qualification + "]";
	}

}
