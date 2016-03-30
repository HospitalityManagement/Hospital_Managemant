package com.company.hospitalitymanagement.dao;

import org.springframework.stereotype.Repository;

import com.company.hospitalitymanagement.entity.Tenant;

@Repository("TenantRepository")
public interface TenantDao {

	public void saveTenant(Tenant tenant);
}
