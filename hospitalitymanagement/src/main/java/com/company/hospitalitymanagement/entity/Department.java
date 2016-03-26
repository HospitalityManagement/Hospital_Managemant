package com.company.hospitalitymanagement.entity;

import java.util.List;

public class Department {

	private String departmentId;
	private String departmentName;
	private List<Doctor> doctorList;
	private String tenantId;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String departmentId, String departmentName,
			List<Doctor> doctorList, String tenantId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.doctorList = doctorList;
		this.tenantId = tenantId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Doctor> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName="
				+ departmentName + ", doctorList=" + doctorList + ", tenantId="
				+ tenantId + "]";
	}

}
