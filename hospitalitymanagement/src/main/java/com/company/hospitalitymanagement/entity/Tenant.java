package com.company.hospitalitymanagement.entity;

public class Tenant {
//sari 4 nanda
	
	private String tenantId;
	private String tenantName;
	private String tenantPassword;
	private String tenantEmailId;
	private String tenantAddress;
	private long tenantMobileNumber;
	
	public Tenant(){
		super();
	}
	
	public Tenant(String tenantId, String tenantName, String tenantPassword,
			String tenantEmailId, String tenantAddress, long tenantMobileNumber) {
		super();
		this.tenantId = tenantId;
		this.tenantName = tenantName;
		this.tenantPassword = tenantPassword;
		this.tenantEmailId = tenantEmailId;
		this.tenantAddress = tenantAddress;
		this.tenantMobileNumber = tenantMobileNumber;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getTenantName() {
		return tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
	public String getTenantPassword() {
		return tenantPassword;
	}
	public void setTenantPassword(String tenantPassword) {
		this.tenantPassword = tenantPassword;
	}
	public String getTenantEmailId() {
		return tenantEmailId;
	}
	public void setTenantEmailId(String tenantEmailId) {
		this.tenantEmailId = tenantEmailId;
	}
	public String getTenantAddress() {
		return tenantAddress;
	}
	public void setTenantAddress(String tenantAddress) {
		this.tenantAddress = tenantAddress;
	}
	public long getTenantMobileNumber() {
		return tenantMobileNumber;
	}
	public void setTenantMobileNumber(long tenantMobileNumber) {
		this.tenantMobileNumber = tenantMobileNumber;
	}

	@Override
	public String toString() {
		return "Tenant [tenantId=" + tenantId + ", tenantName=" + tenantName
				+ ", tenantPassword=" + tenantPassword + ", tenantEmailId="
				+ tenantEmailId + ", tenantAddress=" + tenantAddress
				+ ", tenantMobileNumber=" + tenantMobileNumber + "]";
	}
	
}
