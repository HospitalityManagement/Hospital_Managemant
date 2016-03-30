package com.company.hospitalitymanagement.service;

import org.springframework.stereotype.Service;

import com.company.hospitalitymanagement.entity.Tenant;

@Service("TenantService")
public interface TenanatService {
	
	public void saveTenant(Tenant tenant);
}
