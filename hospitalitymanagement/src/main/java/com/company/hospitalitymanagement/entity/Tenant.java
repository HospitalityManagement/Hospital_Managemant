package com.company.hospitalitymanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TENANT")
public class Tenant {
//sari 4 nanda
	
	@Id
	@Column(name="TENANT_ID")
	private String tenantId;
	
	@Column(name="TENANT_NAME", nullable=false)
	private String tenantName;
	
	@Column(name="TENANT_PASSWORD", nullable=false)
	private String tenantPassword;
	
	@Column(name="TENANT_EMAIL_ID", nullable=false)
	private String tenantEmailId;
	
	@Column(name="TENANT_ADDRESS", nullable=false)
	private String tenantAddress;
	
	@Column(name="TENANT_MOBILE_NUMBER", nullable=false)
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
