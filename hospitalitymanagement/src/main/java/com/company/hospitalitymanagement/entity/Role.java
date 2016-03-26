package com.company.hospitalitymanagement.entity;

public class Role {

	private String roleName;
	private String email;
	private String tenantId;

	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Role(String roleName, String email, String tenantId) {
		super();
		this.roleName = roleName;
		this.email = email;
		this.tenantId = tenantId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@Override
	public String toString() {
		return "Role [roleName=" + roleName + ", email=" + email
				+ ", tenantId=" + tenantId + "]";
	}

}
